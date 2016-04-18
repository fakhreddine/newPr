package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Typechambre;

public interface TypechambreDAO {

	public void addTypechambre(Typechambre p);
	public void updateTypechambre(Typechambre p);
	public List<Typechambre> listTypechambres();
	public Typechambre getTypechambreById(int id);
	public void removeTypechambre(int id);
}

