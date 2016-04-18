package gestionreservation.spring.model;

import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
@Table(name = "admin")
public class Admin extends Utilisateur {
	private static final long serialVersionUID = 1L;

	 @Column(name = "idAdmin")
	private BigInteger idAdmin;
	 @Column(name = "loginAdmin")
	private String loginAdmin;
	 @Column(name = "motDePassAdmin")
	private String motDePassAdmin;

	public BigInteger getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(BigInteger idAdmin) {
		this.idAdmin = idAdmin;
	}



	public String getLoginAdmin() {
		return loginAdmin;
	}

	public void setLoginAdmin(String loginAdmin) {
		this.loginAdmin = loginAdmin;
	}

	public String getMotDePassAdmin() {
		return motDePassAdmin;
	}

	public void setMotDePassAdmin(String motDePassAdmin) {
		this.motDePassAdmin = motDePassAdmin;
	}



	//bi-directional one-to-one association to Utilisateur
	@OneToOne
	@JoinColumn(name="idPersonne")
	private Utilisateur utilisateur;

	public Admin() {
	}


	public BigInteger getIdClient() {
		return this.idAdmin;
	}

	public void setIdClient(BigInteger idClient) {
		this.idAdmin = idClient;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}