package gestionreservation.spring.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
//@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
@Table(name = "client")
public class Client extends Utilisateur{
	private static final long serialVersionUID = 1L;

	@Column(name = "idClient")
	private BigInteger idClient;
	@Column(name = "cin")
	private String cin;
	@Column(name = "dateCreationCin")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreationCin;
	
	
	
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Date getDateCreationCin() {
		return dateCreationCin;
	}

	public void setDateCreationCin(Date dateCreationCin) {
		this.dateCreationCin = dateCreationCin;
	}

	public Client() {
	}

	public BigInteger getIdClient() {
		return this.idClient;
	}

	public void setIdClient(BigInteger idClient) {
		this.idClient = idClient;
	}

}