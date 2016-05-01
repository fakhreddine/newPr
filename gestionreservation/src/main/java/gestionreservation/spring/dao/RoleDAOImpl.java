package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Role;

@Repository
public class RoleDAOImpl implements RoleDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(RoleDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addRole(Role p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Role saved successfully, Role Details="+p);
	}

	public void updateRole(Role p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Role updated successfully, Role Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Role> listRoles() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Role> rolesList = session.createQuery("from Role").list();
		for(Role p : rolesList){
			logger.info("Role List::"+p);
		}
		return rolesList;
	}

	public Role getRoleById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Role p = (Role) session.load(Role.class, new Integer(id));
		logger.info("Role loaded successfully, Role details="+p);
		return p;
	}

	public void removeRole(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Role p = (Role) session.load(Role.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Role deleted successfully, role details="+p);
	}

}
