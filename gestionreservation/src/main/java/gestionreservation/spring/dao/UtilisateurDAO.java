package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Utilisateur;

public interface UtilisateurDAO {

	public void addUtilisateur(Utilisateur p);
	public void updateUtilisateur(Utilisateur p);
	public List<Utilisateur> listUtilisateurs();
	public Utilisateur getUtilisateurById(int id);
	public void removeUtilisateur(int id);
}

