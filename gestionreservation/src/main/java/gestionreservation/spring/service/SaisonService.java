package gestionreservation.spring.service;

import java.util.List;

import gestionreservation.spring.model.Saison;


public interface SaisonService {

	public void addSaison(Saison p);
	public void updateSaison(Saison p);
	public List<Saison> listSaisons();
	public Saison getSaisonById(int id);
	public void removeSaison(int id);
	
}
