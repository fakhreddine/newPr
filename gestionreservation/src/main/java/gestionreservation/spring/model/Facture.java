package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the facture database table.
 * 
 */
@Entity
@Table(name="facture")
@NamedQuery(name="Facture.findAll", query="SELECT f FROM Facture f")
public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idFacture;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFacture;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datePaiement;

	@Column(precision=10)
	private BigDecimal montantFacture;

	//bi-directional one-to-one association to Reservation
	@OneToOne(mappedBy="facture")
	private Reservation reservation;

	public Facture() {
	}

	public int getIdFacture() {
		return this.idFacture;
	}

	public void setIdFacture(int idFacture) {
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

	public Reservation getReservation() {
		return this.reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}