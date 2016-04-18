package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Utilisateur;

@Repository
public class UtilisateurDAOImpl implements UtilisateurDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(UtilisateurDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addUtilisateur(Utilisateur p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Utilisateur saved successfully, Utilisateur Details="+p);
	}

	public void updateUtilisateur(Utilisateur p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Utilisateur updated successfully, Utilisateur Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Utilisateur> listUtilisateurs() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Utilisateur> utilisateursList = session.createQuery("from Utilisateur").list();
		for(Utilisateur p : utilisateursList){
			logger.info("Utilisateur List::"+p);
		}
		return utilisateursList;
	}

	public Utilisateur getUtilisateurById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Utilisateur p = (Utilisateur) session.load(Utilisateur.class, new Integer(id));
		logger.info("Utilisateur loaded successfully, Utilisateur details="+p);
		return p;
	}

	public void removeUtilisateur(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Utilisateur p = (Utilisateur) session.load(Utilisateur.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Utilisateur deleted successfully, utilisateur details="+p);
	}

}
