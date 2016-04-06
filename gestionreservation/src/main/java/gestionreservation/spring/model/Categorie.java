package gestionreservation.spring.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categorie")
public class Categorie {

	@Id
	@Column(name="idCategorie")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCategorie;
	private String description;
	

	
	@OneToMany(mappedBy="categorie",targetEntity=Chambre.class,
	fetch=FetchType.EAGER)
	private Collection<Chambre> chambres;  
	
	
	public Collection<Chambre> getChambres() {
		return chambres;
	}
	public void setChambres(Collection<Chambre> chambres) {
		this.chambres = chambres;
	}
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

