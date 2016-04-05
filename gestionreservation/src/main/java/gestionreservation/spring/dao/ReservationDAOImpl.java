package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Reservation;

@Repository
public class ReservationDAOImpl implements ReservationDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(ReservationDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addReservation(Reservation p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Reservation saved successfully, Reservation Details="+p);
	}

	public void updateReservation(Reservation p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Reservation updated successfully, Reservation Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Reservation> listReservations() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Reservation> reservationsList = session.createQuery("from Reservation").list();
		for(Reservation p : reservationsList){
			logger.info("Reservation List::"+p);
		}
		return reservationsList;
	}

	public Reservation getReservationById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Reservation p = (Reservation) session.load(Reservation.class, new Integer(id));
		logger.info("Reservation loaded successfully, Reservation details="+p);
		return p;
	}

	public void removeReservation(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Reservation p = (Reservation) session.load(Reservation.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Reservation deleted successfully, reservation details="+p);
	}

}
