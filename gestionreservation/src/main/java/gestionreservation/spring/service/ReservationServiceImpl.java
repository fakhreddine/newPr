package gestionreservation.spring.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.ReservationDAO;
import gestionreservation.spring.model.Reservation;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	private ReservationDAO reservationDAO;

	public void setReservationDAO(ReservationDAO reservationDAO) {
		this.reservationDAO = reservationDAO;
	}

	@Transactional
	public void addReservation(Reservation p) {
		this.reservationDAO.addReservation(p);
	}

	@Transactional
	public void updateReservation(Reservation p) {
		this.reservationDAO.updateReservation(p);
	}

	@Transactional
	public List<Reservation> listReservations() {
		return this.reservationDAO.listReservations();
	}

	@Transactional
	public Reservation getReservationById(String id) {
		return this.reservationDAO.getReservationById(id);
	}

	@Transactional
	public void removeReservation(int id) {
		this.reservationDAO.removeReservation(id);
	}

}
