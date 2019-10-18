package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Individual represents a single human being (a man, woman or child). The individual can be a customer, an employee or any other person that the organization needs to store information about.
 */
@ApiModel(description = "Individual represents a single human being (a man, woman or child). The individual can be a customer, an employee or any other person that the organization needs to store information about.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-08T11:42:54.708Z")
@Entity
public class Individual   {
  @JsonProperty("id")
  @Id
  private String id = null;

  @JsonProperty("href")
  @Column
  private String href = null;

  @JsonProperty("aristocraticTitle")
  @Column
  private String aristocraticTitle = null;

  @JsonProperty("birthDate")
  @Column
  private OffsetDateTime birthDate = null;

  @JsonProperty("countryOfBirth")
  @Column
  private String countryOfBirth = null;

  @JsonProperty("deathDate")
  @Column
  private OffsetDateTime deathDate = null;

  @JsonProperty("familyName")
  @Column
  private String familyName = null;

  @JsonProperty("fullName")
  @Column
  private String fullName = null;

  @JsonProperty("gender")
  @Column
  private String gender = null;

  @JsonProperty("@baseType")
  @Column
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  @Column
  private String schemaLocation = null;

  @JsonProperty("@type")
  @Column
  private String type = null;

  public Individual id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the organization
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the organization")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Individual href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink to access the organization
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink to access the organization")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Individual aristocraticTitle(String aristocraticTitle) {
    this.aristocraticTitle = aristocraticTitle;
    return this;
  }

  /**
   * e.g. Baron, Graf, Earl,…
   * @return aristocraticTitle
  **/
  @ApiModelProperty(value = "e.g. Baron, Graf, Earl,…")


  public String getAristocraticTitle() {
    return aristocraticTitle;
  }

  public void setAristocraticTitle(String aristocraticTitle) {
    this.aristocraticTitle = aristocraticTitle;
  }

  public Individual birthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Birth date
   * @return birthDate
  **/
  @ApiModelProperty(value = "Birth date")

  @Valid

  public OffsetDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
  }

  public Individual countryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

  /**
   * Country where the individual was born
   * @return countryOfBirth
  **/
  @ApiModelProperty(value = "Country where the individual was born")


  public String getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public Individual deathDate(OffsetDateTime deathDate) {
    this.deathDate = deathDate;
    return this;
  }

  /**
   * Date of death
   * @return deathDate
  **/
  @ApiModelProperty(value = "Date of death")

  @Valid

  public OffsetDateTime getDeathDate() {
    return deathDate;
  }

  public void setDeathDate(OffsetDateTime deathDate) {
    this.deathDate = deathDate;
  }

  public Individual familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Contains the non-chosen or inherited name. Also known as last name in the Western context
   * @return familyName
  **/
  @ApiModelProperty(value = "Contains the non-chosen or inherited name. Also known as last name in the Western context")


  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Individual fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name flatten (first, middle, and last names)
   * @return fullName
  **/
  @ApiModelProperty(value = "Full name flatten (first, middle, and last names)")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Individual gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender
   * @return gender
  **/
  @ApiModelProperty(value = "Gender")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Individual baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public Individual schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public Individual type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Individual individual = (Individual) o;
    return Objects.equals(this.id, individual.id) &&
        Objects.equals(this.href, individual.href) &&
        Objects.equals(this.aristocraticTitle, individual.aristocraticTitle) &&
        Objects.equals(this.birthDate, individual.birthDate) &&
        Objects.equals(this.countryOfBirth, individual.countryOfBirth) &&
        Objects.equals(this.deathDate, individual.deathDate) &&
        Objects.equals(this.familyName, individual.familyName) &&
        Objects.equals(this.fullName, individual.fullName) &&
        Objects.equals(this.gender, individual.gender) &&
        Objects.equals(this.baseType, individual.baseType) &&
        Objects.equals(this.schemaLocation, individual.schemaLocation) &&
        Objects.equals(this.type, individual.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, aristocraticTitle, birthDate, countryOfBirth, deathDate, familyName, fullName, gender, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Individual {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    aristocraticTitle: ").append(toIndentedString(aristocraticTitle)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    deathDate: ").append(toIndentedString(deathDate)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

