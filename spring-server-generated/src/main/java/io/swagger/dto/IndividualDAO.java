package io.swagger.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import io.swagger.model.Individual;

public class IndividualDAO {

	private Session getSession() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
		return session;
	}
	
	/**
	 * This method persists an Individual object in the database.
	 * 
	 * @param individual
	 * @return
	 */
	public String createIndividual(Individual individual) {
		
		Session session = getSession();
        Transaction tx = session.beginTransaction();
        Object id = session.save(individual);
        tx.commit();
        return id.toString();
	}

	/**
	 * This method loads the specified object with ID from the database.
	 * 
	 * @param id
	 * @return 
	 */
	public Individual retrieveIndividualByID(String id) {
		
		Session session = getSession();
		Individual individual = session.get(Individual.class, id);
		
		return individual;
	}
	
	/**
	 * This method deletes an Individual object from the database.
	 * 
	 * @param id
	 */
	public void deleteIndividual(String id) {
		
		Session session = getSession();
        Transaction tx = session.beginTransaction();
        Individual individual = session.get(Individual.class, id);
        if (null != individual) {
        	session.delete(individual);
		}
        tx.commit();
	}
	
	/**
	 * This method updates an Individual object in the database.
	 * 
	 * @param id
	 * @param individual
	 * @return
	 */
	public Individual updateIndividual(String id, Individual individual) {
		
		Session session = getSession();
        Transaction tx = session.beginTransaction();
        Individual indi = session.get(Individual.class, id);
        if (null != indi) {
        	individual = (Individual) session.merge(individual);
		}
        tx.commit();
        return individual;
	}
}