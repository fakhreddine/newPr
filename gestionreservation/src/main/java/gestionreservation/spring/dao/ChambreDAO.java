package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Chambre;

public interface ChambreDAO {

	public void addChambre(Chambre p);
	public void updateChambre(Chambre p);
	public List<Chambre> listChambres();
	public Chambre getChambreById(int id);
	public void removeChambre(int id);
}

