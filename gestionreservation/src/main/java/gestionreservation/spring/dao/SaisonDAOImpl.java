package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Saison;

@Repository
public class SaisonDAOImpl implements SaisonDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(SaisonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addSaison(Saison p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Saison saved successfully, Saison Details="+p);
	}

	public void updateSaison(Saison p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Saison updated successfully, Saison Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Saison> listSaisons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Saison> saisonsList = session.createQuery("from Saison").list();
		for(Saison p : saisonsList){
			logger.info("Saison List::"+p);
		}
		return saisonsList;
	}

	public Saison getSaisonById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Saison p = (Saison) session.load(Saison.class, new Integer(id));
		logger.info("Saison loaded successfully, Saison details="+p);
		return p;
	}

	public void removeSaison(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Saison p = (Saison) session.load(Saison.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Saison deleted successfully, saison details="+p);
	}

}
