package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the saison database table.
 * 
 */
@Entity
@NamedQuery(name="Saison.findAll", query="SELECT s FROM Saison s")
public class Saison implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSaison;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebutSaison;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinSaison;

	private String descriptionSaison;

	//bi-directional many-to-one association to Offre
	@OneToMany(mappedBy="saison")
	private List<Offre> offres;

	public Saison() {
	}

	public int getIdSaison() {
		return this.idSaison;
	}

	public void setIdSaison(int idSaison) {
		this.idSaison = idSaison;
	}

	public Date getDateDebutSaison() {
		return this.dateDebutSaison;
	}

	public void setDateDebutSaison(Date dateDebutSaison) {
		this.dateDebutSaison = dateDebutSaison;
	}

	public Date getDateFinSaison() {
		return this.dateFinSaison;
	}

	public void setDateFinSaison(Date dateFinSaison) {
		this.dateFinSaison = dateFinSaison;
	}

	public String getDescriptionSaison() {
		return this.descriptionSaison;
	}

	public void setDescriptionSaison(String descriptionSaison) {
		this.descriptionSaison = descriptionSaison;
	}

	public List<Offre> getOffres() {
		return this.offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}

	public Offre addOffre(Offre offre) {
		getOffres().add(offre);
		offre.setSaison(this);

		return offre;
	}

	public Offre removeOffre(Offre offre) {
		getOffres().remove(offre);
		offre.setSaison(null);

		return offre;
	}

}