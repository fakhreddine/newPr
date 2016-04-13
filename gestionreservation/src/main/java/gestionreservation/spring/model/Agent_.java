package gestionreservation.spring.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-04-07T18:00:05.692+0100")
@StaticMetamodel(Agent.class)
public class Agent_ {
	public static volatile SingularAttribute<Agent, Long> idAgent;
	public static volatile SingularAttribute<Agent, String> adresse;
	public static volatile SingularAttribute<Agent, Integer> codePostal;
	public static volatile SingularAttribute<Agent, String> grade;
	public static volatile SingularAttribute<Agent, BigInteger> idUtilisateur;
	public static volatile SingularAttribute<Agent, String> login;
	public static volatile SingularAttribute<Agent, String> motDePass;
	public static volatile SingularAttribute<Agent, String> nom;
	public static volatile SingularAttribute<Agent, Integer> numTel;
	public static volatile SingularAttribute<Agent, String> prenom;
	public static volatile SingularAttribute<Agent, BigDecimal> salaire;
	public static volatile SingularAttribute<Agent, String> ville;
	public static volatile ListAttribute<Agent, Reservation> reservations;
}
