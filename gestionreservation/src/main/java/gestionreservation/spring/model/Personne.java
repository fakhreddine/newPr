package gestionreservation.spring.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the personne database table.
 * 
 */
@Entity
@NamedQuery(name="Personne.findAll", query="SELECT p FROM Personne p")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String idPersonne;

	private String adressePers;

	private String civilitePers;

	private BigDecimal codePostalPers;

	private String emailPers;

	private String nomPers;

	private BigInteger numTelPers;

	private String prenomPers;

	private String villePers;

	//bi-directional many-to-one association to Serviceconsommation
	@OneToMany(mappedBy="personne")
	private List<Serviceconsommation> serviceconsommations;

	public Personne() {
		this.idPersonne="0";
	}

	public String getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(String idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getAdressePers() {
		return this.adressePers;
	}

	public void setAdressePers(String adressePers) {
		this.adressePers = adressePers;
	}

	public String getCivilitePers() {
		return this.civilitePers;
	}

	public void setCivilitePers(String civilitePers) {
		this.civilitePers = civilitePers;
	}

	public BigDecimal getCodePostalPers() {
		return this.codePostalPers;
	}

	public void setCodePostalPers(BigDecimal codePostalPers) {
		this.codePostalPers = codePostalPers;
	}

	public String getEmailPers() {
		return this.emailPers;
	}

	public void setEmailPers(String emailPers) {
		this.emailPers = emailPers;
	}

	public String getNomPers() {
		return this.nomPers;
	}

	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}

	public BigInteger getNumTelPers() {
		return this.numTelPers;
	}

	public void setNumTelPers(BigInteger numTelPers) {
		this.numTelPers = numTelPers;
	}

	public String getPrenomPers() {
		return this.prenomPers;
	}

	public void setPrenomPers(String prenomPers) {
		this.prenomPers = prenomPers;
	}

	public String getVillePers() {
		return this.villePers;
	}

	public void setVillePers(String villePers) {
		this.villePers = villePers;
	}

	public List<Serviceconsommation> getServiceconsommations() {
		return this.serviceconsommations;
	}

	public void setServiceconsommations(List<Serviceconsommation> serviceconsommations) {
		this.serviceconsommations = serviceconsommations;
	}

	public Serviceconsommation addServiceconsommation(Serviceconsommation serviceconsommation) {
		getServiceconsommations().add(serviceconsommation);
		serviceconsommation.setPersonne(this);

		return serviceconsommation;
	}

	public Serviceconsommation removeServiceconsommation(Serviceconsommation serviceconsommation) {
		getServiceconsommations().remove(serviceconsommation);
		serviceconsommation.setPersonne(null);

		return serviceconsommation;
	}




}