package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Reservation;
public interface ReservationDAO {

	public void addReservation(Reservation p);
	public void updateReservation(Reservation p);
	public List<Reservation> listReservations();
	public Reservation getReservationById(String id);
	public void removeReservation(int id);
}

