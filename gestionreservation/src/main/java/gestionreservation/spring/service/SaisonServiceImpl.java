package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.SaisonDAO;
import gestionreservation.spring.model.Saison;

@Service
public class SaisonServiceImpl implements SaisonService {
	
	private SaisonDAO saisonDAO;

	public void setSaisonDAO(SaisonDAO saisonDAO) {
		this.saisonDAO = saisonDAO;
	}

	@Transactional
	public void addSaison(Saison p) {
		this.saisonDAO.addSaison(p);
	}

	@Transactional
	public void updateSaison(Saison p) {
		this.saisonDAO.updateSaison(p);
	}

	@Transactional
	public List<Saison> listSaisons() {
		return this.saisonDAO.listSaisons();
	}

	@Transactional
	public Saison getSaisonById(int id) {
		return this.saisonDAO.getSaisonById(id);
	}

	@Transactional
	public void removeSaison(int id) {
		this.saisonDAO.removeSaison(id);
	}

}

