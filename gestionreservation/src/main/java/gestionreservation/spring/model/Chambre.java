package gestionreservation.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Chambre")
public class Chambre {

	@Id
	@Column(name="idChambre")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idChambre;
	
	private int numChambre;
	private int tel_chambre;
//	private Categorie categorie;
	
	public int getIdChambre() {
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

