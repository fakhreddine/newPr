package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;


/**
 * The persistent class for the serviceconsommation database table.
 * 
 */
@Entity
@NamedQuery(name="Serviceconsommation.findAll", query="SELECT s FROM Serviceconsommation s")
public class Serviceconsommation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String idService;

	private String categorieServ;

	private String descriptionServ;

	private BigDecimal prixServ;

	//bi-directional many-to-one association to Facture
	@ManyToOne
	@JoinColumn(name="idFacture")
	private Facture facture;

	//bi-directional many-to-one association to Personne
	@ManyToOne
	@JoinColumn(name="idPersonne")
	private Personne personne;

	//bi-directional many-to-one association to Reservation
	@ManyToOne
	@JoinColumn(name="idReservation")
	private Reservation reservation;

	public Serviceconsommation() {
	}

	public String getIdService() {
		return this.idService;
	}

	public void setIdService(String idService) {
		this.idService = idService;
	}

	public String getCategorieServ() {
		return this.categorieServ;
	}

	public void setCategorieServ(String categorieServ) {
		this.categorieServ = categorieServ;
	}

	public String getDescriptionServ() {
		return this.descriptionServ;
	}

	public void setDescriptionServ(String descriptionServ) {
		this.descriptionServ = descriptionServ;
	}

	public BigDecimal getPrixServ() {
		return this.prixServ;
	}

	public void setPrixServ(BigDecimal prixServ) {
		this.prixServ = prixServ;
	}

	public Facture getFacture() {
		return this.facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Reservation getReservation() {
		return this.reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}