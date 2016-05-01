package gestionreservation.spring.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the agent database table.
 * 
 */
@Entity
@NamedQuery(name="Agent.findAll", query="SELECT a FROM Agent a")
@Table(name = "agent")
public class Agent extends Utilisateur{
	private static final long serialVersionUID = 1L;
	 @Column(name = "grad")
	private String grade;
	 @Column(name = "idAgent")
	private BigInteger idAgent;
	 @Column(name = "salaire")
	private BigDecimal salaire;

	//bi-directional many-to-one association to Hotel
/*	@ManyToOne
	@JoinColumn(name="idHotel")
	private Hotel hotel;
*/
	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="agent")
	private List<Reservation> reservations;

	public Agent() {
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public BigInteger getIdAgent() {
		return this.idAgent;
	}

	public void setIdAgent(BigInteger idAgent) {
		this.idAgent = idAgent;
	}

	public BigDecimal getSalaire() {
		return this.salaire;
	}

	public void setSalaire(BigDecimal salaire) {
		this.salaire = salaire;
	}

	

	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Reservation addReservation(Reservation reservation) {
		getReservations().add(reservation);
		reservation.setAgent(this);

		return reservation;
	}

	public Reservation removeReservation(Reservation reservation) {
		getReservations().remove(reservation);
		reservation.setAgent(null);

		return reservation;
	}

}