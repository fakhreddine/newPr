package gestionreservation.spring.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-04-07T18:02:52.057+0100")
@StaticMetamodel(Reservation.class)
public class Reservation_ {
	public static volatile SingularAttribute<Reservation, Long> idReservation;
	public static volatile SingularAttribute<Reservation, Byte> arriver;
	public static volatile SingularAttribute<Reservation, Date> dateDebutSejour;
	public static volatile SingularAttribute<Reservation, Date> dateFinSejour;
	public static volatile SingularAttribute<Reservation, Date> dateReservation;
	public static volatile SingularAttribute<Reservation, Byte> sortie;
	public static volatile SingularAttribute<Reservation, Agent> agent;
	public static volatile ListAttribute<Reservation, Chambre> chambres;
	public static volatile SingularAttribute<Reservation, Client> client;
	public static volatile SingularAttribute<Reservation, Facture> facture;
}
