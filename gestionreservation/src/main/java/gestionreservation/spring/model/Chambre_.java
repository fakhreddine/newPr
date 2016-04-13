package gestionreservation.spring.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-04-07T18:00:58.063+0100")
@StaticMetamodel(Chambre.class)
public class Chambre_ {
	public static volatile SingularAttribute<Chambre, Long> idChambre;
	public static volatile SingularAttribute<Chambre, Integer> numChambre;
	public static volatile SingularAttribute<Chambre, Integer> telChambre;
	public static volatile ListAttribute<Chambre, Reservation> reservations;
	public static volatile SingularAttribute<Chambre, Categorie> categorie;
}
