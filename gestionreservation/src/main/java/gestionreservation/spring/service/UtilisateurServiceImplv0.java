package gestionreservation.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.UtilisateurDAO;
import gestionreservation.spring.dao.UtilisateurDAOImpl;
import gestionreservation.spring.model.Utilisateur;

@Service

public class UtilisateurServiceImplv0 implements UtilisateurService {
	
	@Autowired
	private UtilisateurDAOImpl utilisateurDAO1;
	
	@Transactional
	public UtilisateurDAOImpl getUtilisateurDAO1() {
		return utilisateurDAO1;
	}
	@Transactional
	public void setUtilisateurDAO1(UtilisateurDAOImpl utilisateurDAO) {
		this.utilisateurDAO1 = utilisateurDAO;
	}      
	@Transactional
	public void addUtilisateur(Utilisateur p) {
		utilisateurDAO1.addUtilisateur(p);
		
	}
	@Transactional
	public void singUtilisateur(Utilisateur p) {
		utilisateurDAO1.singUtilisateur(p);
		
	}
	@Transactional
	public void updateUtilisateur(Utilisateur p) {
		utilisateurDAO1.updateUtilisateur(p);
	}
	@Transactional
	public List<Utilisateur> listUtilisateurs() {
		
		return utilisateurDAO1.listUtilisateurs();
	}

	public Utilisateur getUtilisateurById(int id) {
		
	 return utilisateurDAO1.getUtilisateurById(id);
	}

	public void removeUtilisateur(int id) {
		utilisateurDAO1.removeUtilisateur(id);
		
	}
	

}

