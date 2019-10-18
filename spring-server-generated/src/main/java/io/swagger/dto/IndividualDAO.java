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
        System.out.println(id.toString());
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
}