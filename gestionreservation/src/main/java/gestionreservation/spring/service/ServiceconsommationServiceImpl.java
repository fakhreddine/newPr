package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.ServiceconsommationDAO;
import gestionreservation.spring.model.Serviceconsommation;

@Service
public class ServiceconsommationServiceImpl implements ServiceconsommationService {
	
	private ServiceconsommationDAO serviceconsommationsDAO;

	public void setServiceconsommationDAO(ServiceconsommationDAO serviceconsommationsDAO) {
		this.serviceconsommationsDAO = serviceconsommationsDAO;
	}

	@Transactional
	public void addServiceconsommation(Serviceconsommation p) {
		this.serviceconsommationsDAO.addServiceconsommation(p);
	}

	@Transactional
	public void updateServiceconsommation(Serviceconsommation p) {
		this.serviceconsommationsDAO.updateServiceconsommation(p);
	}

	@Transactional
	public List<Serviceconsommation> listServiceconsommations() {
		return this.serviceconsommationsDAO.listServiceconsommations();
	}

	@Transactional
	public Serviceconsommation getServiceconsommationById(int id) {
		return this.serviceconsommationsDAO.getServiceconsommationById(id);
	}

	@Transactional
	public void removeServiceconsommation(int id) {
		this.serviceconsommationsDAO.removeServiceconsommation(id);
	}

}

