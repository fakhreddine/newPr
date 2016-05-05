package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Offre;

@Repository
public class OffreDAOImpl implements OffreDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(OffreDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addOffre(Offre p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Offre saved successfully, Offre Details="+p);
	}

	public void updateOffre(Offre p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Offre updated successfully, Offre Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Offre> listOffres() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Offre> offresList = session.createQuery("from offre").list();
		for(Offre p : offresList){
			logger.info("Offre List::"+p);
		}
		return offresList;
	}

	@SuppressWarnings("unchecked")
	public Offre getOffreById(String id) {
		Session session = this.sessionFactory.getCurrentSession();		
		//Offre p = (Offre) session.load(Offre.class, new String(id));
		//logger.info("Offre loaded successfully, Offre details="+p);
		List<Offre> offresList = session.createQuery("from Offre where idOffre='"+id+"'").list();
		if(offresList.get(0)!=null)
		{
			return offresList.get(0);
		}else{
			return new Offre();
		}
		
	}

	public void removeOffre(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Offre p = (Offre) session.load(Offre.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Offre deleted successfully, offre details="+p);
	}

}
