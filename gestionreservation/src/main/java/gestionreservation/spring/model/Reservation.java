package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the reservation database table.
 * 
 */
@Entity
@Table(name="reservation")
@NamedQuery(name="Reservation.findAll", query="SELECT r FROM Reservation r")
public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long idReservation;

	private byte arriver;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebutSejour;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinSejour;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateReservation;

	private byte sortie;

	//bi-directional many-to-one association to Agent
	@ManyToOne
	@JoinColumn(name="idAgent", referencedColumnName="idAgent")
	private Agent agent;

	//bi-directional many-to-many association to Chambre
	@ManyToMany
	@JoinTable(
		name="chambrereservation"
		, joinColumns={
			@JoinColumn(name="idReservation", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="idChambre", nullable=false)
			}
		)
	private List<Chambre> chambres;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="idClient", referencedColumnName="idClient")
	private Client client;

	//bi-directional one-to-one association to Facture
	@OneToOne
	@JoinColumn(name="idFacture", nullable=false)
	private Facture facture;

	public Reservation() {
	}

	public long getIdReservation() {
		return this.idReservation;
	}

	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}

	public byte getArriver() {
		return this.arriver;
	}

	public void setArriver(byte arriver) {
		this.arriver = arriver;
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

	public byte getSortie() {
		return this.sortie;
	}

	public void setSortie(byte sortie) {
		this.sortie = sortie;
	}

	public Agent getAgent() {
		return this.agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public List<Chambre> getChambres() {
		return this.chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Facture getFacture() {
		return this.facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

}