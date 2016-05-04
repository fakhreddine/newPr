package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.List;


/**
 * The persistent class for the chambre database table.
 * 
 */
@Entity
@NamedQuery(name="Chambre.findAll", query="SELECT c FROM Chambre c")
public class Chambre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String idChambre;

	private boolean activer;

	private int numChambre;
	private int nbPlace;
	private int telChambre;

	public int getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	//bi-directional many-to-one association to Categorie
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;

	
	//bi-directional many-to-one association to Hotel
	@ManyToOne
	@JoinColumn(name="idHotel")
	private Hotel hotel;

	//bi-directional many-to-many association to Reservation
	@ManyToMany
	@JoinTable(
		name="regroupe"
		, joinColumns={
			@JoinColumn(name="idChambre")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idReservation")
			}
		)
	private List<Reservation> reservations;

	//bi-directional many-to-one association to Typechambre
	@ManyToOne
	@JoinColumn(name="idType")
	private Typechambre typechambre;

	//bi-directional many-to-one association to Offre
	@OneToMany(mappedBy="chambre")
	private List<Offre> offres;

	public Chambre() {
	}

	public String getIdChambre() {
		return this.idChambre;
	}

	public void setIdChambre(String idChambre) {
		this.idChambre = idChambre;
	}

	public boolean getActiver() {
		return this.activer;
	}

	public void setActiver(boolean activer) {
		this.activer = activer;
	}

	public int getNumChambre() {
		return this.numChambre;
	}

	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}

	public int getTelChambre() {
		return this.telChambre;
	}

	public void setTelChambre(int telChambre) {
		this.telChambre = telChambre;
	}

	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Typechambre getTypechambre() {
		return this.typechambre;
	}

	public void setTypechambre(Typechambre typechambre) {
		this.typechambre = typechambre;
	}

	public List<Offre> getOffres() {
		return this.offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}

	public Offre addOffre(Offre offre) {
		getOffres().add(offre);
		offre.setChambre(this);

		return offre;
	}

	public Offre removeOffre(Offre offre) {
		getOffres().remove(offre);
		offre.setChambre(null);

		return offre;
	}

}