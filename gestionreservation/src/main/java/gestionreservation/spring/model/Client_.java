package gestionreservation.spring.model;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-04-13T11:55:36.056+0100")
@StaticMetamodel(Client.class)
public class Client_ {
	public static volatile SingularAttribute<Client, Long> idClient;
	public static volatile SingularAttribute<Client, String> adresse;
	public static volatile SingularAttribute<Client, Integer> codePostal;
	public static volatile SingularAttribute<Client, Integer> email;
	public static volatile SingularAttribute<Client, BigInteger> idUtilisateur;
	public static volatile SingularAttribute<Client, String> login;
	public static volatile SingularAttribute<Client, String> motDePass;
	public static volatile SingularAttribute<Client, String> nom;
	public static volatile SingularAttribute<Client, Integer> numTel;
	public static volatile SingularAttribute<Client, String> prenom;
	public static volatile SingularAttribute<Client, String> ville;
	public static volatile ListAttribute<Client, Reservation> reservations;
}
