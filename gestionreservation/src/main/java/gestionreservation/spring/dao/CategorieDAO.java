package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Categorie;

public interface CategorieDAO {

	public void addCategorie(Categorie p);
	public void updateCategorie(Categorie p);
	public List<Categorie> listCategories();
	public Categorie getCategorieById(int id);
	public void removeCategorie(int id);
}
