package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Personne;

@Repository
public class PersonneDAOImpl implements PersonneDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonneDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addPersonne(Personne p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Personne saved successfully, Personne Details="+p);
	}

	public void updatePersonne(Personne p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Personne updated successfully, Personne Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Personne> listPersonnes() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Personne> personnesList = session.createQuery("from Personne").list();
		for(Personne p : personnesList){
			logger.info("Personne List::"+p);
		}
		return personnesList;
	}

	public Personne getPersonneById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Personne p = (Personne) session.load(Personne.class, new Integer(id));
		logger.info("Personne loaded successfully, Personne details="+p);
		return p;
	}

	public void removePersonne(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Personne p = (Personne) session.load(Personne.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Personne deleted successfully, personne details="+p);
	}

}
