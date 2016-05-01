package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pension database table.
 * 
 */
@Entity
@NamedQuery(name="Pension.findAll", query="SELECT p FROM Pension p")
public class Pension implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPension;
	private String labelPension;
	@Column(columnDefinition = "text")
	private String descriptionPension;
	
	
	public String getLabelPension() {
		return labelPension;
	}

	public void setLabelPension(String labelPension) {
		this.labelPension = labelPension;
	}

	//bi-directional many-to-one association to Offre
	@OneToMany(mappedBy="pension")
	private List<Offre> offres;

	public Pension() {
	}

	public int getIdPension() {
		return this.idPension;
	}

	public void setIdPension(int idPension) {
		this.idPension = idPension;
	}

	public String getDescriptionPension() {
		return this.descriptionPension;
	}

	public void setDescriptionPension(String descriptionPension) {
		this.descriptionPension = descriptionPension;
	}

	public List<Offre> getOffres() {
		return this.offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}

	public Offre addOffre(Offre offre) {
		getOffres().add(offre);
		offre.setPension(this);

		return offre;
	}

	public Offre removeOffre(Offre offre) {
		getOffres().remove(offre);
		offre.setPension(null);

		return offre;
	}

}