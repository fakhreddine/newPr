package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Personne;

public interface PersonneDAO {

	public void addPersonne(Personne p);
	public void updatePersonne(Personne p);
	public List<Personne> listPersonnes();
	public Personne getPersonneById(int id);
	public void removePersonne(int id);
}

