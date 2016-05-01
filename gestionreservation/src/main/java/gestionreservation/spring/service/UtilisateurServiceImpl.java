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

public class UtilisateurServiceImpl implements UserDetailsService {
	
	@Autowired
	private UtilisateurDAOImpl utilisateurDAO;
	
	@Transactional
	public UtilisateurDAOImpl getUtilisateurDAO() {
		return utilisateurDAO;
	}
	@Transactional
	public void setUtilisateurDAO(UtilisateurDAOImpl utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}      
	@Transactional
	@Override
	public Utilisateur loadUserByUsername(String username) throws UsernameNotFoundException {
		return utilisateurDAO.loadUserByUsername(username);
	}
	
	public void addUtilisateur(Utilisateur p) {
		utilisateurDAO.addUtilisateur(p);
		
	}

	public void updateUtilisateur(Utilisateur p) {
		utilisateurDAO.updateUtilisateur(p);
	}

	public List<Utilisateur> listUtilisateurs() {
		
		return utilisateurDAO.listUtilisateurs();
	}

	public Utilisateur getUtilisateurById(int id) {
		
	 return utilisateurDAO.getUtilisateurById(id);
	}

	public void removeUtilisateur(int id) {
		utilisateurDAO.removeUtilisateur(id);
		
	}
	

}

