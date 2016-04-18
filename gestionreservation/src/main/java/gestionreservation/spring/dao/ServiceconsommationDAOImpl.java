package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Serviceconsommation;

@Repository
public class ServiceconsommationDAOImpl implements ServiceconsommationDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceconsommationDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addServiceconsommation(Serviceconsommation p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Serviceconsommation saved successfully, Serviceconsommation Details="+p);
	}

	public void updateServiceconsommation(Serviceconsommation p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Serviceconsommation updated successfully, Serviceconsommation Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Serviceconsommation> listServiceconsommations() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Serviceconsommation> serviceConsommationsList = session.createQuery("from Serviceconsommation").list();
		for(Serviceconsommation p : serviceConsommationsList){
			logger.info("Serviceconsommation List::"+p);
		}
		return serviceConsommationsList;
	}

	public Serviceconsommation getServiceconsommationById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Serviceconsommation p = (Serviceconsommation) session.load(Serviceconsommation.class, new Integer(id));
		logger.info("Serviceconsommation loaded successfully, Serviceconsommation details="+p);
		return p;
	}

	public void removeServiceconsommation(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Serviceconsommation p = (Serviceconsommation) session.load(Serviceconsommation.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Serviceconsommation deleted successfully, serviceConsommation details="+p);
	}

}
