package gestionreservation.spring.service;

import java.util.List;

import gestionreservation.spring.model.Serviceconsommation;


public interface ServiceconsommationService {

	public void addServiceconsommation(Serviceconsommation p);
	public void updateServiceconsommation(Serviceconsommation p);
	public List<Serviceconsommation> listServiceconsommations();
	public Serviceconsommation getServiceconsommationById(int id);
	public void removeServiceconsommation(int id);
	
}
