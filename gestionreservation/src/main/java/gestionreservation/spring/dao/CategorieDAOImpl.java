package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Categorie;

@Repository
public class CategorieDAOImpl implements CategorieDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(CategorieDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addCategorie(Categorie p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Categorie saved successfully, Categorie Details="+p);
	}

	public void updateCategorie(Categorie p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Categorie updated successfully, Categorie Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Categorie> listCategories() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Categorie> categoriesList = session.createQuery("from Categorie").list();
		for(Categorie p : categoriesList){
			logger.info("Categorie List::"+p);
		}
		return categoriesList;
	}

	public Categorie getCategorieById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Categorie p = (Categorie) session.load(Categorie.class, new Integer(id));
		logger.info("Categorie loaded successfully, Categorie details="+p);
		return p;
	}

	public void removeCategorie(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Categorie p = (Categorie) session.load(Categorie.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Categorie deleted successfully, categorie details="+p);
	}

}
