package gestionreservation.spring.model;

import java.io.Serializable;

public class ChambreReservationId implements Serializable {

  private long idReservation;
  private long idChambre;
  public int hashCode() {
    return (int)(idReservation + idChambre);
  }
  public boolean equals(Object object) {
    if (object instanceof ChambreReservationId) {
    	ChambreReservationId otherId = (ChambreReservationId) object;
      return (otherId.idReservation == this.idReservation) && (otherId.idChambre == this.idChambre);
    }
    return false;
  }

}