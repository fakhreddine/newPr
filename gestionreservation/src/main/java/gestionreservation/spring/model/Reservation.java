package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the reservation database table.
 * 
 */
@Entity
@NamedQuery(name="Reservation.findAll", query="SELECT r FROM Reservation r")
public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String idReservation;

	private boolean arrivee;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebutSejour;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinSejour;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateReservation;

	private BigDecimal montantPayer;

	private BigDecimal montantTotal;

	private int nbPersonne;

	private boolean reserver;

	private boolean sortie;

	//bi-directional many-to-many association to Chambre
	@ManyToMany(mappedBy="reservations")
	private List<Chambre> chambres;

	//bi-directional many-to-one association to Agent
	@ManyToOne
	@JoinColumn(name="idAgent")
	private Utilisateur agent;

	//bi-directional many-to-one association to Facture
	@ManyToOne
	@JoinColumn(name="idFacture")
	private Facture facture;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="idClient")
	private Utilisateur client;

	//bi-directional many-to-one association to Serviceconsommation
	@OneToMany(mappedBy="reservation")
	private List<Serviceconsommation> serviceconsommations;

	public Reservation() {
	}

	public String getIdReservation() {
		return this.idReservation;
	}

	public void setIdReservation(String idReservation) {
		this.idReservation = idReservation;
	}

	public boolean getArrivee() {
		return this.arrivee;
	}

	public void setArrivee(boolean arrivee) {
		this.arrivee = arrivee;
	}

	public Date getDateDebutSejour() {
		return this.dateDebutSejour;
	}

	public void setDateDebutSejour(Date dateDebutSejour) {
		this.dateDebutSejour = dateDebutSejour;
	}

	public Date getDateFinSejour() {
		return this.dateFinSejour;
	}

	public void setDateFinSejour(Date dateFinSejour) {
		this.dateFinSejour = dateFinSejour;
	}

	public Date getDateReservation() {
		return this.dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public BigDecimal getMontantPayer() {
		return this.montantPayer;
	}

	public void setMontantPayer(BigDecimal montantPayer) {
		this.montantPayer = montantPayer;
	}

	public BigDecimal getMontantTotal() {
		return this.montantTotal;
	}

	public void setMontantTotal(BigDecimal montantTotal) {
		this.montantTotal = montantTotal;
	}

	public int getNbPersonne() {
		return this.nbPersonne;
	}

	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}

	public Object getReserver() {
		return this.reserver;
	}

	public void setReserver(boolean reserver) {
		this.reserver = reserver;
	}

	public Object getSortie() {
		return this.sortie;
	}

	public void setSortie(boolean sortie) {
		this.sortie = sortie;
	}

	public List<Chambre> getChambres() {
		return this.chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	public Utilisateur getAgent() {
		return this.agent;
	}

	public void setAgent(Utilisateur agent) {
		this.agent = agent;
	}

	public Facture getFacture() {
		return this.facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	

	public Utilisateur getClient() {
		return client;
	}

	public void setClient(Utilisateur client) {
		this.client = client;
	}

	public List<Serviceconsommation> getServiceconsommations() {
		return this.serviceconsommations;
	}

	public void setServiceconsommations(List<Serviceconsommation> serviceconsommations) {
		this.serviceconsommations = serviceconsommations;
	}

	public Serviceconsommation addServiceconsommation(Serviceconsommation serviceconsommation) {
		getServiceconsommations().add(serviceconsommation);
		serviceconsommation.setReservation(this);

		return serviceconsommation;
	}

	public Serviceconsommation removeServiceconsommation(Serviceconsommation serviceconsommation) {
		getServiceconsommations().remove(serviceconsommation);
		serviceconsommation.setReservation(null);

		return serviceconsommation;
	}

}