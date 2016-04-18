package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Facture;

@Repository
public class FactureDAOImpl implements FactureDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(FactureDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addFacture(Facture p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Facture saved successfully, Facture Details="+p);
	}

	public void updateFacture(Facture p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Facture updated successfully, Facture Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Facture> listFactures() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Facture> facturesList = session.createQuery("from Facture").list();
		for(Facture p : facturesList){
			logger.info("Facture List::"+p);
		}
		return facturesList;
	}

	public Facture getFactureById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Facture p = (Facture) session.load(Facture.class, new Integer(id));
		logger.info("Facture loaded successfully, Facture details="+p);
		return p;
	}

	public void removeFacture(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Facture p = (Facture) session.load(Facture.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Facture deleted successfully, facture details="+p);
	}

}
