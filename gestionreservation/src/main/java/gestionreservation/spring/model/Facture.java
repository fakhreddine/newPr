package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the facture database table.
 * 
 */
@Entity
@NamedQuery(name="Facture.findAll", query="SELECT f FROM Facture f")
public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String idFacture;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFacture;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datePaiement;

	private BigDecimal montantFacture;

	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="facture")
	private List<Reservation> reservations;

	//bi-directional many-to-one association to Serviceconsommation
	@OneToMany(mappedBy="facture")
	private List<Serviceconsommation> serviceconsommations;

	public Facture() {
	}

	public String getIdFacture() {
		return this.idFacture;
	}

	public void setIdFacture(String idFacture) {
		this.idFacture = idFacture;
	}

	public Date getDateFacture() {
		return this.dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Date getDatePaiement() {
		return this.datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public BigDecimal getMontantFacture() {
		return this.montantFacture;
	}

	public void setMontantFacture(BigDecimal montantFacture) {
		this.montantFacture = montantFacture;
	}

	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Reservation addReservation(Reservation reservation) {
		getReservations().add(reservation);
		reservation.setFacture(this);

		return reservation;
	}

	public Reservation removeReservation(Reservation reservation) {
		getReservations().remove(reservation);
		reservation.setFacture(null);

		return reservation;
	}

	public List<Serviceconsommation> getServiceconsommations() {
		return this.serviceconsommations;
	}

	public void setServiceconsommations(List<Serviceconsommation> serviceconsommations) {
		this.serviceconsommations = serviceconsommations;
	}

	public Serviceconsommation addServiceconsommation(Serviceconsommation serviceconsommation) {
		getServiceconsommations().add(serviceconsommation);
		serviceconsommation.setFacture(this);

		return serviceconsommation;
	}

	public Serviceconsommation removeServiceconsommation(Serviceconsommation serviceconsommation) {
		getServiceconsommations().remove(serviceconsommation);
		serviceconsommation.setFacture(null);

		return serviceconsommation;
	}

}