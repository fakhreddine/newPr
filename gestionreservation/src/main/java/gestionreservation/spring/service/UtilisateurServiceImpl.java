package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.UtilisateurDAO;
import gestionreservation.spring.model.Utilisateur;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
	
	private UtilisateurDAO utilisateurDAO;

	public void setUtilisateurDAO(UtilisateurDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}

	@Transactional
	public void addUtilisateur(Utilisateur p) {
		this.utilisateurDAO.addUtilisateur(p);
	}

	@Transactional
	public void updateUtilisateur(Utilisateur p) {
		this.utilisateurDAO.updateUtilisateur(p);
	}

	@Transactional
	public List<Utilisateur> listUtilisateurs() {
		return this.utilisateurDAO.listUtilisateurs();
	}

	@Transactional
	public Utilisateur getUtilisateurById(int id) {
		return this.utilisateurDAO.getUtilisateurById(id);
	}

	@Transactional
	public void removeUtilisateur(int id) {
		this.utilisateurDAO.removeUtilisateur(id);
	}

}

