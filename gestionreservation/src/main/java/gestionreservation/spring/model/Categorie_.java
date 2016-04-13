package gestionreservation.spring.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-04-07T18:00:05.707+0100")
@StaticMetamodel(Categorie.class)
public class Categorie_ {
	public static volatile SingularAttribute<Categorie, Integer> idCategorie;
	public static volatile SingularAttribute<Categorie, String> description;
	public static volatile ListAttribute<Categorie, Chambre> chambres;
}
