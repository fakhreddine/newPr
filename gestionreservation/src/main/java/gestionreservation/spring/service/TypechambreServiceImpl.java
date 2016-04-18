package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.TypechambreDAO;
import gestionreservation.spring.model.Typechambre;

@Service
public class TypechambreServiceImpl implements TypechambreService {
	
	private TypechambreDAO typechambreDAO;

	public void setTypechambreDAO(TypechambreDAO typechambreDAO) {
		this.typechambreDAO = typechambreDAO;
	}

	@Transactional
	public void addTypechambre(Typechambre p) {
		this.typechambreDAO.addTypechambre(p);
	}

	@Transactional
	public void updateTypechambre(Typechambre p) {
		this.typechambreDAO.updateTypechambre(p);
	}

	@Transactional
	public List<Typechambre> listTypechambres() {
		return this.typechambreDAO.listTypechambres();
	}

	@Transactional
	public Typechambre getTypechambreById(int id) {
		return this.typechambreDAO.getTypechambreById(id);
	}

	@Transactional
	public void removeTypechambre(int id) {
		this.typechambreDAO.removeTypechambre(id);
	}

}

