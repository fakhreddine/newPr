package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Typechambre;

@Repository
public class TypechambreDAOImpl implements TypechambreDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(TypechambreDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addTypechambre(Typechambre p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Typechambre saved successfully, Typechambre Details="+p);
	}

	public void updateTypechambre(Typechambre p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Typechambre updated successfully, Typechambre Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Typechambre> listTypechambres() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Typechambre> hotelsList = session.createQuery("from Typechambre").list();
		for(Typechambre p : hotelsList){
			logger.info("Typechambre List::"+p);
		}
		return hotelsList;
	}

	public Typechambre getTypechambreById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Typechambre p = (Typechambre) session.load(Typechambre.class, new Integer(id));
		logger.info("Typechambre loaded successfully, Typechambre details="+p);
		return p;
	}

	public void removeTypechambre(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Typechambre p = (Typechambre) session.load(Typechambre.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Typechambre deleted successfully, hotel details="+p);
	}

}
