package gestionreservation.spring.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
//@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
@Table(name = "utilisateur")
public class Utilisateur extends Personne {
	private static final long serialVersionUID = 1L;

	 @Column(name = "idUtilisateur")
	private BigInteger idUtilisateur;
	 @Column(name = "login")
	private String login;
	 @Column(name = "motDePass")
	private String motDePass;

	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="utilisateur")
	private List<Reservation> reservations;

	public Utilisateur() {
	}

	public BigInteger getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(BigInteger idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePass() {
		return this.motDePass;
	}

	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}


	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Reservation addReservation(Reservation reservation) {
		getReservations().add(reservation);
		reservation.setUtilisateur(this);

		return reservation;
	}

	public Reservation removeReservation(Reservation reservation) {
		getReservations().remove(reservation);
		reservation.setUtilisateur(null);

		return reservation;
	}


}