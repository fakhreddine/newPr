package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Serviceconsommation;

public interface ServiceconsommationDAO {

	public void addServiceconsommation(Serviceconsommation p);
	public void updateServiceconsommation(Serviceconsommation p);
	public List<Serviceconsommation> listServiceconsommations();
	public Serviceconsommation getServiceconsommationById(int id);
	public void removeServiceconsommation(int id);
}

