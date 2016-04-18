package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Pension;

@Repository
public class PensionDAOImpl implements PensionDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PensionDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addPension(Pension p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Pension saved successfully, Pension Details="+p);
	}

	public void updatePension(Pension p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Pension updated successfully, Pension Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Pension> listPensions() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Pension> hotelsList = session.createQuery("from Pension").list();
		for(Pension p : hotelsList){
			logger.info("Pension List::"+p);
		}
		return hotelsList;
	}

	public Pension getPensionById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Pension p = (Pension) session.load(Pension.class, new Integer(id));
		logger.info("Pension loaded successfully, Pension details="+p);
		return p;
	}

	public void removePension(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Pension p = (Pension) session.load(Pension.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Pension deleted successfully, hotel details="+p);
	}

}
