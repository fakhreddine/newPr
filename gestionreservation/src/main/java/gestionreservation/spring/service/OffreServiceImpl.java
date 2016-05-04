package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.OffreDAO;
import gestionreservation.spring.model.Offre;

@Service
public class OffreServiceImpl implements OffreService {
	
	private OffreDAO offreDAO;

	public void setOffreDAO(OffreDAO offreDAO) {
		this.offreDAO = offreDAO;
	}

	@Transactional
	public void addOffre(Offre p) {
		this.offreDAO.addOffre(p);
	}

	@Transactional
	public void updateOffre(Offre p) {
		this.offreDAO.updateOffre(p);
	}

	@Transactional
	public List<Offre> listOffres() {
		return this.offreDAO.listOffres();
	}

	@Transactional
	public Offre getOffreById(String id) {
		return this.offreDAO.getOffreById(id);
	}

	@Transactional
	public void removeOffre(int id) {
		this.offreDAO.removeOffre(id);
	}

}

