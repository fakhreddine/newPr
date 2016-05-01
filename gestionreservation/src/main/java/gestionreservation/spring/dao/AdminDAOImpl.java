package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addAdmin(Admin p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Admin saved successfully, Admin Details="+p);
	}

	public void updateAdmin(Admin p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Admin updated successfully, Admin Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Admin> listAdmins() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Admin> adminsList = session.createQuery("from Admin").list();
		for(Admin p : adminsList){
			logger.info("Admin List::"+p);
		}
		return adminsList;
	}

	public Admin getAdminById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Admin p = (Admin) session.load(Admin.class, new Integer(id));
		logger.info("Admin loaded successfully, Admin details="+p);
		return p;
	}

	public void removeAdmin(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Admin p = (Admin) session.load(Admin.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Admin deleted successfully, admin details="+p);
	}

}
