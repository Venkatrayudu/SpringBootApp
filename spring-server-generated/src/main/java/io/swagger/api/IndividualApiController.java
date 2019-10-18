package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Individual;
import io.swagger.model.IndividualCreate;
import io.swagger.model.IndividualUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.dto.IndividualDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-08T11:42:54.708Z")

@Controller
public class IndividualApiController<T> implements IndividualApi {

    private static final Logger log = LoggerFactory.getLogger(IndividualApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    private IndividualDAO individualDAO; 

    @org.springframework.beans.factory.annotation.Autowired
    public IndividualApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        individualDAO = new IndividualDAO();
    }

    public ResponseEntity<Individual> createIndividual(@ApiParam(value = "The Individual to be created" ,required=true )  @Valid @RequestBody IndividualCreate individual) {
        String accept = request.getHeader("Accept");
        log.info("createIndividual()");
        
        if (accept != null && accept.contains("application/json")) {
            try {
            	Individual indi = copyObjectDataa(individual);
            	
            	String id = individualDAO.createIndividual(indi);
            	log.info("Individual created with ID: [" + id + "]");
	            	
                return new ResponseEntity<Individual>(indi, HttpStatus.CREATED);
//              return new ResponseEntity<Individual>(objectMapper.readValue("{  \"aristocraticTitle\" : \"aristocraticTitle\",  \"gender\" : \"gender\",  \"@baseType\" : \"@baseType\",  \"countryOfBirth\" : \"countryOfBirth\",  \"@type\" : \"@type\",  \"familyName\" : \"familyName\",  \"deathDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"fullName\" : \"fullName\",  \"id\" : \"id\",  \"href\" : \"href\",  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\"}", Individual.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Individual>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<Individual>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteIndividual(@ApiParam(value = "Identifier of the Individual",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        log.info("deleteIndividual()");
        if (accept != null && accept.contains("application/json")) {
        	Individual indi = individualDAO.retrieveIndividualByID(id);
        	if (null == indi) {
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			} else {
				individualDAO.deleteIndividual(id);
	        	log.info("Individual with id [" + id + "] deleted.");
	        	return new ResponseEntity<Void>(HttpStatus.OK);
			}
        }
        return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Individual>> listIndividual(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        log.info("listIndividual()");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Individual>>(objectMapper.readValue("[ {  \"aristocraticTitle\" : \"aristocraticTitle\",  \"gender\" : \"gender\",  \"@baseType\" : \"@baseType\",  \"countryOfBirth\" : \"countryOfBirth\",  \"@type\" : \"@type\",  \"familyName\" : \"familyName\",  \"deathDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"fullName\" : \"fullName\",  \"id\" : \"id\",  \"href\" : \"href\",  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\"}, {  \"aristocraticTitle\" : \"aristocraticTitle\",  \"gender\" : \"gender\",  \"@baseType\" : \"@baseType\",  \"countryOfBirth\" : \"countryOfBirth\",  \"@type\" : \"@type\",  \"familyName\" : \"familyName\",  \"deathDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"fullName\" : \"fullName\",  \"id\" : \"id\",  \"href\" : \"href\",  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Individual>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Individual>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Individual> patchIndividual(@ApiParam(value = "Identifier of the Individual",required=true) @PathVariable("id") String id,@ApiParam(value = "The Individual to be updated" ,required=true )  @Valid @RequestBody IndividualUpdate individual) {
        String accept = request.getHeader("Accept");
        log.info("patchIndividual()");
        if (accept != null && accept.contains("application/json")) {
            try {
            	Individual individ = individualDAO.retrieveIndividualByID(id);
            	if (null == individ) {
    				return new ResponseEntity<Individual>(HttpStatus.NO_CONTENT);
    			} else {
    				Individual indi = copyObjectData(individual);
    				individualDAO.updateIndividual(id, indi);
    	        	log.info("Individual with id [" + id + "] deleted.");
    	        	return new ResponseEntity<Individual>(HttpStatus.OK);
    			}
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Individual>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<Individual>(HttpStatus.NOT_IMPLEMENTED);
    }

    private Individual copyObjectDataa(IndividualCreate individual) {
		Individual indi = new Individual();
			indi.setId(individual.getId());
			indi.setHref(individual.getHref());
			indi.setAristocraticTitle(individual.getAristocraticTitle());
			indi.setBirthDate(individual.getBirthDate());
			indi.setCountryOfBirth(individual.getCountryOfBirth());
			indi.setDeathDate(individual.getDeathDate());
			indi.setFamilyName(individual.getFamilyName());
			indi.setFullName(individual.getFullName());
			indi.setGender(individual.getGender());
			indi.setBaseType(individual.getBaseType());
			indi.setSchemaLocation(individual.getSchemaLocation());
			indi.setType(individual.getType());
		return indi;
	}
    
	private Individual copyObjectData(IndividualUpdate individual) {
		Individual indi = new Individual();
			indi.setId(individual.getId());
			indi.setHref(individual.getHref());
			indi.setAristocraticTitle(individual.getAristocraticTitle());
			indi.setBirthDate(individual.getBirthDate());
			indi.setCountryOfBirth(individual.getCountryOfBirth());
			indi.setDeathDate(individual.getDeathDate());
			indi.setFamilyName(individual.getFamilyName());
			indi.setFullName(individual.getFullName());
			indi.setGender(individual.getGender());
			indi.setBaseType(individual.getBaseType());
			indi.setSchemaLocation(individual.getSchemaLocation());
			indi.setType(individual.getType());
		return indi;
	}

    public ResponseEntity<Individual> retrieveIndividual(@ApiParam(value = "Identifier of the Individual",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        log.info("retrieveIndividual()");
        log.info("Fields: [" + fields + "]");
        if (accept != null && accept.contains("application/json")) {
            try {
            	Individual indi = individualDAO.retrieveIndividualByID(id);
            	if (null == indi) {
					return new ResponseEntity<Individual>(HttpStatus.NOT_FOUND);
				} else {
					if (fields != null && fields != "") {
	            		List<String> fieldsList = Arrays.asList(fields.split("\\s*,\\s*"));
	            		Individual individual = setValuesToFields(indi, fieldsList);
	            		return new ResponseEntity<Individual>(individual, HttpStatus.OK);
					}
	            	return new ResponseEntity<Individual>(indi, HttpStatus.OK);
				}
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Individual>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Individual>(HttpStatus.NOT_IMPLEMENTED);
    }

	private Individual setValuesToFields(Individual indi, List<String> fieldsList) {
		Individual individual = new Individual();
		for (String field : fieldsList) {
			switch (field) {
			case "id":
				individual.setId(indi.getId());
				break;
			case "href":
				individual.setHref(indi.getHref());
				break;
			case "aristocraticTitle":
				individual.setAristocraticTitle(indi.getAristocraticTitle());
				break;
			case "birthDate":
				individual.setBirthDate(indi.getBirthDate());
				break;
			case "countryOfBirth":
				individual.setCountryOfBirth(indi.getCountryOfBirth());
				break;
			case "deathDate":
				individual.setDeathDate(indi.getDeathDate());
				break;
			case "familyName":
				individual.setFamilyName(indi.getFamilyName());
				break;
			case "fullName":
				individual.setFullName(indi.getFullName());
				break;
			case "gender":
				individual.setGender(indi.getGender());
				break;
			case "baseType":
				individual.setBaseType(indi.getBaseType());
				break;
			case "schemaLocation":
				individual.setSchemaLocation(indi.getSchemaLocation());
				break;
			case "type":
				individual.setType(indi.getType());
				break;

			default:
				log.info("Invalid field: [" + field + "]");
				break;
			}
		}
		return individual;
	}

}
