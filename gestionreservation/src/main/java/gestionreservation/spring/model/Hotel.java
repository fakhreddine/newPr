package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the hotel database table.
 * 
 */
@Entity
@NamedQuery(name="Hotel.findAll", query="SELECT h FROM Hotel h")
public class Hotel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idHotel;

	private String adresseHotel;

	private int codePostalHotel;

	private int faxHotel;

	private String nomHotel;

	private int telHotel;

	private String villeHotel;

	//bi-directional many-to-one association to Agent
	@OneToMany(mappedBy="hotel")
	private List<Agent> agents;

	//bi-directional many-to-one association to Chambre
	@OneToMany(mappedBy="hotel")
	private List<Chambre> chambres;

	//bi-directional many-to-one association to Offre
	@OneToMany(mappedBy="hotel")
	private List<Offre> offres;

	public Hotel() {
	}

	public int getIdHotel() {
		return this.idHotel;
	}

	public void setIdHotel(int idHotel) {
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

	public int getFaxHotel() {
		return this.faxHotel;
	}

	public void setFaxHotel(int faxHotel) {
		this.faxHotel = faxHotel;
	}

	public String getNomHotel() {
		return this.nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public int getTelHotel() {
		return this.telHotel;
	}

	public void setTelHotel(int telHotel) {
		this.telHotel = telHotel;
	}

	public String getVilleHotel() {
		return this.villeHotel;
	}

	public void setVilleHotel(String villeHotel) {
		this.villeHotel = villeHotel;
	}

	public List<Agent> getAgents() {
		return this.agents;
	}

	public void setAgents(List<Agent> agents) {
		this.agents = agents;
	}

	public Agent addAgent(Agent agent) {
		getAgents().add(agent);
		agent.setHotel(this);

		return agent;
	}

	public Agent removeAgent(Agent agent) {
		getAgents().remove(agent);
		agent.setHotel(null);

		return agent;
	}

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