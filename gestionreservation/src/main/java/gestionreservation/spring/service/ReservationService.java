package gestionreservation.spring.service;

import java.util.List;

import gestionreservation.spring.model.Reservation;


public interface ReservationService {

	public void addReservation(Reservation p);
	public void updateReservation(Reservation p);
	public List<Reservation> listReservations();
	public Reservation getReservationById(String id);
	public void removeReservation(int id);
	
}
