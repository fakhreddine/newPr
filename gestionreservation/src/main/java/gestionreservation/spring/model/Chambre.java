package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the chambre database table.
 * 
 */
@Entity
@Table(name="chambre")
@NamedQuery(name="Chambre.findAll", query="SELECT c FROM Chambre c")
public class Chambre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long idChambre;

	private int numChambre;

	private int telChambre;

	//bi-directional many-to-many association to Reservation
	@ManyToMany(mappedBy="chambres")
	private List<Reservation> reservations;

	//bi-directional many-to-one association to Categorie
	@ManyToOne
	@JoinColumn(name="idCategorie", nullable=false)
	private Categorie categorie;

	public Chambre() {
	}

	public long getIdChambre() {
		return this.idChambre;
	}

	public void setIdChambre(long idChambre) {
		this.idChambre = idChambre;
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

	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}