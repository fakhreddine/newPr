package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.ChambreDAO;
import gestionreservation.spring.model.Chambre;


@Service
public class ChambreServiceImpl implements ChambreService {
	
	private ChambreDAO chambreDAO;

	public void setChambreDAO(ChambreDAO chambreDAO) {
		this.chambreDAO = chambreDAO;
	}

	@Transactional
	public void addChambre(Chambre p) {
		this.chambreDAO.addChambre(p);
	}

	@Transactional
	public void updateChambre(Chambre p) {
		this.chambreDAO.updateChambre(p);
	}

	@Transactional
	public List<Chambre> listChambres() {
		return this.chambreDAO.listChambres();
	}

	@Transactional
	public Chambre getChambreById(int id) {
		return this.chambreDAO.getChambreById(id);
	}

	@Transactional
	public void removeChambre(int id) {
		this.chambreDAO.removeChambre(id);
	}

}
