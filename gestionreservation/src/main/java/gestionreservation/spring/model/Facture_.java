package gestionreservation.spring.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-04-07T18:00:05.761+0100")
@StaticMetamodel(Facture.class)
public class Facture_ {
	public static volatile SingularAttribute<Facture, Integer> idFacture;
	public static volatile SingularAttribute<Facture, Date> dateFacture;
	public static volatile SingularAttribute<Facture, Date> datePaiement;
	public static volatile SingularAttribute<Facture, BigDecimal> montantFacture;
	public static volatile SingularAttribute<Facture, Reservation> reservation;
}
