package gestionreservation.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ChambreReservation")
@IdClass(ChambreReservationId.class)
public class ChambreReservation {
  @Id
  private long idReservation;
  @Id
  private long idChambre;
  @ManyToOne
  @PrimaryKeyJoinColumn(name="idReservation", referencedColumnName="ID")
  private Reservation reservations;
  @ManyToOne
  @PrimaryKeyJoinColumn(name="idChambre", referencedColumnName="ID")
  private Chambre chambre;
public Reservation getReservations() {
	return reservations;
}
public void setReservation(Reservation reservations) {
	this.reservations = reservations;
}
public Chambre getChambre() {
	return chambre;
}
public void setChambre(Chambre chambre) {
	this.chambre = chambre;
}
public long getIdReservation() {
	return idReservation;
}
public void setIdReservation(long idReservation) {
	this.idReservation = idReservation;
}
public long getIdChambre() {
	return idChambre;
}
public void setIdChambre(long idChambre) {
	this.idChambre = idChambre;
}

  
}