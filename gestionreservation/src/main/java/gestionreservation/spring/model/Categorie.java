package gestionreservation.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Categorie")
public class Categorie {

	@Id
	@Column(name="idCategorie")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCategorie;
	private String description;
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", Description=" + description + "]";
	}
	
	
}

