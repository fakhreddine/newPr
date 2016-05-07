package gestionreservation.spring.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import gestionreservation.spring.model.Typechambre;
import gestionreservation.spring.model.Utilisateur;


public interface UtilisateurService {

	public void addUtilisateur(Utilisateur p);
	public void updateUtilisateur(Utilisateur p);
	public List<Utilisateur> listUtilisateurs();
	public Utilisateur getUtilisateurById(int id);
	public void singUtilisateur(Utilisateur p);
	public void removeUtilisateur(int id);
	
}
