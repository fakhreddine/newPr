package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the offre database table.
 * 
 */
@Entity
@NamedQuery(name="Offre.findAll", query="SELECT o FROM Offre o")
public class Offre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String idOffre;

	private int prixOffre;

	//bi-directional many-to-one association to Chambre
	@ManyToOne
	@JoinColumn(name="idChambre")
	private Chambre chambre;

	//bi-directional many-to-one association to Hotel
	@ManyToOne
	@JoinColumn(name="idHotel")
	private Hotel hotel;

	//bi-directional many-to-one association to Pension
	@ManyToOne
	@JoinColumn(name="idPension")
	private Pension pension;

	//bi-directional many-to-one association to Saison
	@ManyToOne
	@JoinColumn(name="idSaison")
	private Saison saison;

	public Offre() {
	}

	public String getIdOffre() {
		return this.idOffre;
	}

	public void setIdOffre(String idOffre) {
		this.idOffre = idOffre;
	}

	public int getPrixOffre() {
		return this.prixOffre;
	}

	public void setPrixOffre(int prixOffre) {
		this.prixOffre = prixOffre;
	}

	public Chambre getChambre() {
		return this.chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Pension getPension() {
		return this.pension;
	}

	public void setPension(Pension pension) {
		this.pension = pension;
	}

	public Saison getSaison() {
		return this.saison;
	}

	public void setSaison(Saison saison) {
		this.saison = saison;
	}

}