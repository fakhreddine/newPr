package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.FactureDAO;
import gestionreservation.spring.model.Facture;

@Service
public class FactureServiceImpl implements FactureService {
	
	private FactureDAO factureDAO;

	public void setFactureDAO(FactureDAO factureDAO) {
		this.factureDAO = factureDAO;
	}

	@Transactional
	public void addFacture(Facture p) {
		this.factureDAO.addFacture(p);
	}

	@Transactional
	public void updateFacture(Facture p) {
		this.factureDAO.updateFacture(p);
	}

	@Transactional
	public List<Facture> listFactures() {
		return this.factureDAO.listFactures();
	}

	@Transactional
	public Facture getFactureById(int id) {
		return this.factureDAO.getFactureById(id);
	}

	@Transactional
	public void removeFacture(int id) {
		this.factureDAO.removeFacture(id);
	}

}

