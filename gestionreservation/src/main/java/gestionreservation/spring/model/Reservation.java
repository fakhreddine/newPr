package gestionreservation.spring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Reservation")
public class Reservation {

	@Id
	@Column(name="idReservation")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idReservation;
	
	private Date dateDebutSejour;
	private Date dateFinSejour;
	private Date dateReservation;
	private boolean arriver;
	private boolean sortie;
	
	@OneToMany(mappedBy="reservations")
	private List<ChambreReservation> chambres;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clienId")
	private Client client;
	
	public List<ChambreReservation> getChambres() {
		return chambres;
	}
	public void setChambres(List<ChambreReservation> chambres) {
		this.chambres = chambres;
	}
	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
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
	public long getIdReservation() {
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

