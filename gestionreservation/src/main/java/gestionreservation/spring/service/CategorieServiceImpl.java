package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.CategorieDAO;
import gestionreservation.spring.model.Categorie;

@Service
public class CategorieServiceImpl implements CategorieService {
	
	private CategorieDAO categorieDAO;

	public void setCategorieDAO(CategorieDAO categorieDAO) {
		this.categorieDAO = categorieDAO;
	}

	@Transactional
	public void addCategorie(Categorie p) {
		this.categorieDAO.addCategorie(p);
	}

	@Transactional
	public void updateCategorie(Categorie p) {
		this.categorieDAO.updateCategorie(p);
	}

	@Transactional
	public List<Categorie> listCategories() {
		return this.categorieDAO.listCategories();
	}

	@Transactional
	public Categorie getCategorieById(int id) {
		return this.categorieDAO.getCategorieById(id);
	}

	@Transactional
	public void removeCategorie(int id) {
		this.categorieDAO.removeCategorie(id);
	}

}

