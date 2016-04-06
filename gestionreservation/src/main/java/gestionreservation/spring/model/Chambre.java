package gestionreservation.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Chambre")
public class Chambre {

	@Id
	@Column(name="idChambre")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idChambre;
	
	private int numChambre;
	private int tel_chambre;
	
	@Column(name = "idCategorie")
    private int idCategorie;
	@ManyToOne(optional=false)
    @JoinColumn(name="idCategorie",referencedColumnName="idCategorie",updatable=false,insertable=false)
	private Categorie categorie;
	
	
	 @OneToMany(mappedBy="chambre")
	  private List<ChambreReservation> reservations;
	  // Add an employee to the project.
	  // Create an association object for the relationship and set its data.
	  public void addReservation(Reservation reservation) {
		ChambreReservation chambreReservation = new ChambreReservation();
		chambreReservation.setReservation(reservation);
		chambreReservation.setChambre(this);
		chambreReservation.setIdReservation(reservation.getIdReservation());
		chambreReservation.setIdChambre(this.getIdChambre());
	    this.reservations.add(chambreReservation);
	    // Also add the association object to the employee.
	    reservation.getChambres().add(chambreReservation);
	  }
	
	
	
	
	//@OneToMany(mappedBy="chambre")
	//private List<Reservation> clients;
//	public void addClient(Client client, boolean teamLead) {
//	    Reservation reservation = new Reservation();
//	    reservation.setClient(client);
//	    reservation.setChambre(this);
//	    reservation.setClientId(client.getIdClient());
//	    reservation.setChambreId(this.getIdChambre());
//	    reservation.setIsTeamLead(teamLead);
//
//	    this.clients.add(reservation);
//	    // Also add the association object to the employee.
//	    client.getChambres().add(reservation);
//	  }
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Chambre [idChambre=" + idChambre + ", numChambre=" + numChambre + ", tel_chambre=" + tel_chambre
				+ ", categorie=" + categorie + "]";
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public long getIdChambre() {
		return idChambre;
	}
	public void setIdChambre(int idChambre) {
		this.idChambre = idChambre;
	}
	public int getNumChambre() {
		return numChambre;
	}
	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}
	public int getTel_chambre() {
		return tel_chambre;
	}
	public void setTel_chambre(int tel_chambre) {
		this.tel_chambre = tel_chambre;
	}
	
	

}

