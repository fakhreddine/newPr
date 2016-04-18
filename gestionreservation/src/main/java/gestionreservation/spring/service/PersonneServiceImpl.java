package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.PersonneDAO;
import gestionreservation.spring.model.Personne;

@Service
public class PersonneServiceImpl implements PersonneService {
	
	private PersonneDAO personneDAO;

	public void setPersonneDAO(PersonneDAO personneDAO) {
		this.personneDAO = personneDAO;
	}

	@Transactional
	public void addPersonne(Personne p) {
		this.personneDAO.addPersonne(p);
	}

	@Transactional
	public void updatePersonne(Personne p) {
		this.personneDAO.updatePersonne(p);
	}

	@Transactional
	public List<Personne> listPersonnes() {
		return this.personneDAO.listPersonnes();
	}

	@Transactional
	public Personne getPersonneById(int id) {
		return this.personneDAO.getPersonneById(id);
	}

	@Transactional
	public void removePersonne(int id) {
		this.personneDAO.removePersonne(id);
	}

}

