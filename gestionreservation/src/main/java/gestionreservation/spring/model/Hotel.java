package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.List;

/**
 * The persistent class for the hotel database table.
 * 
 */
@Entity
@NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h")
public class Hotel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String idHotel;

	private String nomHotel;

	private String emailHotel;

	private String adresseHotel;

	private int codePostalHotel;

	private String faxHotel;

	@Column(columnDefinition = "text")
	private String descriptionHotel;

	private String telHotel;

	private String villeHotel;

	
	public String getEmailHotel() {
		return emailHotel;
	}

	public void setEmailHotel(String emailHotel) {
		this.emailHotel = emailHotel;
	}

	public String getFaxHotel() {
		return faxHotel;
	}

	public void setFaxHotel(String faxHotel) {
		this.faxHotel = faxHotel;
	}

	public String getTelHotel() {
		return telHotel;
	}

	public void setTelHotel(String telHotel) {
		this.telHotel = telHotel;
	}

	public String getDescriptionHotel() {
		return descriptionHotel;
	}

	public void setDescriptionHotel(String descriptionHotel) {
		this.descriptionHotel = descriptionHotel;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "hotel")
	private Utilisateur directeur;

	public Utilisateur getDirecteur() {
		return directeur;
	}

	public void setDirecteur(Utilisateur directeur) {
		this.directeur = directeur;
	}

	// bi-directional many-to-one association to Agent
	/*
	 * @OneToMany(mappedBy="hotel") private List<Agent> agents;
	 */
	// bi-directional many-to-one association to Chambre
	@OneToMany(mappedBy = "hotel")
	private List<Chambre> chambres;

	// bi-directional many-to-one association to Offre
	@OneToMany(mappedBy = "hotel")
	private List<Offre> offres;

	public Hotel() {
	}

	public String getIdHotel() {
		return this.idHotel;
	}

	public void setIdHotel(String idHotel) {
		this.idHotel = idHotel;
	}

	public String getAdresseHotel() {
		return this.adresseHotel;
	}

	public void setAdresseHotel(String adresseHotel) {
		this.adresseHotel = adresseHotel;
	}

	public int getCodePostalHotel() {
		return this.codePostalHotel;
	}

	public void setCodePostalHotel(int codePostalHotel) {
		this.codePostalHotel = codePostalHotel;
	}

	public String getNomHotel() {
		return this.nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public String getVilleHotel() {
		return this.villeHotel;
	}

	public void setVilleHotel(String villeHotel) {
		this.villeHotel = villeHotel;
	}

	/*
	 * public List<Agent> getAgents() { return this.agents; }
	 * 
	 * public void setAgents(List<Agent> agents) { this.agents = agents; }
	 */
	/*
	 * public Agent addAgent(Agent agent) { getAgents().add(agent);
	 * agent.setHotel(this);
	 * 
	 * return agent; }
	 * 
	 * public Agent removeAgent(Agent agent) { getAgents().remove(agent);
	 * agent.setHotel(null);
	 * 
	 * return agent; }
	 */
	public List<Chambre> getChambres() {
		return this.chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	public Chambre addChambre(Chambre chambre) {
		getChambres().add(chambre);
		chambre.setHotel(this);

		return chambre;
	}

	public Chambre removeChambre(Chambre chambre) {
		getChambres().remove(chambre);
		chambre.setHotel(null);

		return chambre;
	}

	public List<Offre> getOffres() {
		return this.offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}

	public Offre addOffre(Offre offre) {
		getOffres().add(offre);
		offre.setHotel(this);

		return offre;
	}

	public Offre removeOffre(Offre offre) {
		getOffres().remove(offre);
		offre.setHotel(null);

		return offre;
	}

}