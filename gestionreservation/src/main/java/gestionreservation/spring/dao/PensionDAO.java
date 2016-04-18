package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Pension;

public interface PensionDAO {

	public void addPension(Pension p);
	public void updatePension(Pension p);
	public List<Pension> listPensions();
	public Pension getPensionById(int id);
	public void removePension(int id);
}

