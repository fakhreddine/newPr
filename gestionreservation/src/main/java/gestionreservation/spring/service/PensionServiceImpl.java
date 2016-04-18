package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.PensionDAO;
import gestionreservation.spring.model.Pension;

@Service
public class PensionServiceImpl implements PensionService {
	
	private PensionDAO pensionDAO;

	public void setPensionDAO(PensionDAO pensionDAO) {
		this.pensionDAO = pensionDAO;
	}

	@Transactional
	public void addPension(Pension p) {
		this.pensionDAO.addPension(p);
	}

	@Transactional
	public void updatePension(Pension p) {
		this.pensionDAO.updatePension(p);
	}

	@Transactional
	public List<Pension> listPensions() {
		return this.pensionDAO.listPensions();
	}

	@Transactional
	public Pension getPensionById(int id) {
		return this.pensionDAO.getPensionById(id);
	}

	@Transactional
	public void removePension(int id) {
		this.pensionDAO.removePension(id);
	}

}

