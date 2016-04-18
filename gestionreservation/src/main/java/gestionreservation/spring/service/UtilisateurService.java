package gestionreservation.spring.service;

import java.util.List;

import gestionreservation.spring.model.Utilisateur;


public interface UtilisateurService {

	public void addUtilisateur(Utilisateur p);
	public void updateUtilisateur(Utilisateur p);
	public List<Utilisateur> listUtilisateurs();
	public Utilisateur getUtilisateurById(int id);
	public void removeUtilisateur(int id);
	
}
