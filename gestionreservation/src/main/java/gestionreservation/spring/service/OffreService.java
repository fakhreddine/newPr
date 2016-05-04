package gestionreservation.spring.service;

import java.util.List;

import gestionreservation.spring.model.Offre;


public interface OffreService {

	public void addOffre(Offre p);
	public void updateOffre(Offre p);
	public List<Offre> listOffres();
	public Offre getOffreById(String id);
	public void removeOffre(int id);
	
}
