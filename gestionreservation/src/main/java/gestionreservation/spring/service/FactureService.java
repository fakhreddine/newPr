package gestionreservation.spring.service;

import java.util.List;

import gestionreservation.spring.model.Facture;


public interface FactureService {

	public void addFacture(Facture p);
	public void updateFacture(Facture p);
	public List<Facture> listFactures();
	public Facture getFactureById(int id);
	public void removeFacture(int id);
	
}
