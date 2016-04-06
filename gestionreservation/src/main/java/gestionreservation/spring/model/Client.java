package gestionreservation.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {

	@Id
	@Column(name="idClient")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private int codePostal;
	private String numTel;
	private String Email; 
	@OneToMany(mappedBy="client")
	private List<Reservation> chambres;
	
	@OneToMany(mappedBy="client")
	private List<Reservation> reservations;
	
	public List<Reservation> getChambres() {
		return chambres;
	}
	public void setChambres(List<Reservation> chambres) {
		this.chambres = chambres;
	}
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String nom, String prenom, String adresse, String ville, int codePostal, String numTel,
			String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.numTel = numTel;
		Email = email;
	}


	public long getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public int getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	public String getNumTel() {
		return numTel;
	}


	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	@Override
	public String toString(){
		return prenom+" "+nom+", "+adresse+" "+ville+" "+codePostal;
	}
}
