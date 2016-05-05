package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Chambre;

@Repository
public class ChambreDAOImpl implements ChambreDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(ChambreDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addChambre(Chambre p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Chambre saved successfully, Chambre Details="+p);
	}

	public void updateChambre(Chambre p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Chambre updated successfully, Chambre Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Chambre> listChambres() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Chambre> chambresList = session.createQuery("from chambre").list();
		/*for(Chambre p : chambresList){
			logger.info("Chambre List::"+p);
		}*/
		return chambresList;
	}

	public Chambre getChambreById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Chambre p = (Chambre) session.load(Chambre.class, new Integer(id));
		logger.info("Chambre loaded successfully, Chambre details="+p);
		return p;
	}

	public void removeChambre(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Chambre p = (Chambre) session.load(Chambre.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Chambre deleted successfully, chambre details="+p);
	}

}
