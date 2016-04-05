package gestionreservation.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reservation")
public class Reservation {

	@Id
	@Column(name="idReservation")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReservation;
	//private Client client;
	//private Chambre chambre;
	private Date dateDebutSejour;
	private Date dateFinSejour;
	private Date dateReservation;
	private boolean arriver;
	private boolean sortie;
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(int idReservation, Date dateDebutSejour, Date dateFinSejour, Date dateReservation,
			boolean arriver, boolean sortie) {
		super();
		this.idReservation = idReservation;
		this.dateDebutSejour = dateDebutSejour;
		this.dateFinSejour = dateFinSejour;
		this.dateReservation = dateReservation;
		this.arriver = arriver;
		this.sortie = sortie;
	}
	public int getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	public Date getDateDebutSejour() {
		return dateDebutSejour;
	}
	public void setDateDebutSejour(Date dateDebutSejour) {
		this.dateDebutSejour = dateDebutSejour;
	}
	public Date getDateFinSejour() {
		return dateFinSejour;
	}
	public void setDateFinSejour(Date dateFinSejour) {
		this.dateFinSejour = dateFinSejour;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public boolean isArriver() {
		return arriver;
	}
	public void setArriver(boolean arriver) {
		this.arriver = arriver;
	}
	public boolean isSortie() {
		return sortie;
	}
	public void setSortie(boolean sortie) {
		this.sortie = sortie;
	}
	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateDebutSejour=" + dateDebutSejour
				+ ", dateFinSejour=" + dateFinSejour + ", dateReservation=" + dateReservation + ", arriver=" + arriver
				+ ", sortie=" + sortie + "]";
	}
	
	
	
}

