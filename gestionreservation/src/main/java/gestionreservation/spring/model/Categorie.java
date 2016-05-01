package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categorie database table.
 * 
 */
@Entity
@NamedQuery(name="Categorie.findAll", query="SELECT c FROM Categorie c")
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCategorie;

	private String labelCatgorie;
	@Column(columnDefinition = "text")
	private String descriptionCatgorie;
	
	public String getLabelCatgorie() {
		return labelCatgorie;
	}

	public void setLabelCatgorie(String labelCatgorie) {
		this.labelCatgorie = labelCatgorie;
	}
	

	//bi-directional many-to-one association to Chambre
	@OneToMany(mappedBy="categorie")
	private List<Chambre> chambres;

	public Categorie() {
	}

	public int getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getDescriptionCatgorie() {
		return this.descriptionCatgorie;
	}

	public void setDescriptionCatgorie(String descriptionCatgorie) {
		this.descriptionCatgorie = descriptionCatgorie;
	}

	public List<Chambre> getChambres() {
		return this.chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	public Chambre addChambre(Chambre chambre) {
		getChambres().add(chambre);
		chambre.setCategorie(this);

		return chambre;
	}

	public Chambre removeChambre(Chambre chambre) {
		getChambres().remove(chambre);
		chambre.setCategorie(null);

		return chambre;
	}

}