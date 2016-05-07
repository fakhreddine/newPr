import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import gestionreservation.spring.model.Categorie;
import gestionreservation.spring.model.Chambre;
import gestionreservation.spring.model.Hotel;
import gestionreservation.spring.model.Offre;
import gestionreservation.spring.model.Pension;
import gestionreservation.spring.model.Reservation;
import gestionreservation.spring.model.Role;
import gestionreservation.spring.model.Saison;
import gestionreservation.spring.model.Typechambre;
import gestionreservation.spring.model.Utilisateur;

class main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		
		/*Categorie*/
		Categorie cat1 = new Categorie();
		cat1.setLabelCatgorie("Chambre HARMONY");
		cat1.setDescriptionCatgorie("Chambre pour 1 ou 2 personnes, totalement r�nov�e dans un design tr�s contemporain.Moins spacieuse que la chambre Tradition mais avec beaucoup de charme, elle b�n�ficie de toutes les prestations et du confort n�cessaires: climatisation r�versible, minibar, coffre-fort, bureau, t�l�viseur aux 50 cha�nes fran�aises et internationales, acc�s wifi gratuit. Salle de bain uniquement avec douche. Literie avec un lit en largeur 160. Il n'est pas possible d'avoir 2 lits s�par�s dans cette cat�gorie de chambre. ");
		session.save(cat1);
		Categorie cat2 = new Categorie();
		cat2.setLabelCatgorie("Chambre TRADITION");
		cat2.setDescriptionCatgorie("Cette chambre pour 1 ou 2 personnes, plus spacieuse que la chambre Harmony mais � la d�coration plus ancienne, offre le choix entre un lit Double en largeur 180 ou 2 lits s�par�s en largeur 90. Cette possibilit�, pour �tre pris en compte, doit imp�rativement �tre signifi�e au moment de la r�servation ou au plus tard la veille de l'arriv�e. Dans le cas ou cel� n'aurait �t� pr�cis�, la chambre sera dress�e avec un lit Double et ne pourra plus �tre modifi�e.�quipement de la chambre: douche ou baignoire, climatisation, minibar, coffre-fort, bureau, t�l�viseur avec ses 50 cha�nes fran�aises et internationales, acc�s wifi gratuit.");
		session.save(cat2);
		Categorie cat3 = new Categorie();
		cat3.setLabelCatgorie("Chambre TRIPLE");
		cat3.setDescriptionCatgorie("Chambre pour 3 personnes tout confort: climatisation r�versible, minibar, coffre-fort, bureau, t�l�viseur aux 50 cha�nes fran�aises et internationales, acc�s wifi gratuit.  Lors de la r�servation de cette chambre, ou au plus tard la veille de votre arriv�e, vous devez pr�ciser si vous souhaitez un lit Double avec un lit Simple ou si vous optez pour 3 lits s�par�s. Dans le cas o� rien n'aurait �t� pr�cis�, la chambre sera pr�par�e avec 2 lits, un lit Double et un lit Simple, et l'h�tel n'aura plus la possibilit� de la modifier.");
		session.save(cat3);
		Categorie cat4 = new Categorie();
		cat4.setLabelCatgorie("Chambre FAMILIALE");
		cat4.setDescriptionCatgorie("Cette chambre familiale pour 4 personnes, avec douche � l'italienne � jets, lumineuse, moderne et totalement r�nov�e, est l'assurance d'un agr�able s�jour. Vous appr�cierez sa d�coration contemporaine et ses prestations de standing: climatisation reversible, minibar, coffre-fort, s�che-cheveux, bureau, dressing, t�l�viseur grand �cran en 140 cm aux 50 cha�nes fran�aises et internationales ainsi qu'un acc�s wifi gratuit. Cette chambre dispose de plus, d'un canap�-lit donnant la possibilit� d'accueillir une 5�me personne avec un suppl�ment de prix. Pr�vue avec un lit Double pour les parents et 2 lits Simples pour les enfants, elle peut �tre r�serv�e, soit avec 4 lits s�par�s, soit avec 2 lits Doubles. Pour �tre prise en compte, cette demande doit nous parvenir, au plus tard, la veille de l'arriv�e.");
		session.save(cat4);
		Categorie cat5 = new Categorie();
		cat5.setLabelCatgorie("Chambre PRIVILEGE");
		cat5.setDescriptionCatgorie("Chambre pour 2 personnes, tr�s spacieuse, totalement r�nov�e, disposant d'un coin salon avec canap�, table basse et t�l�viseur grand �cran diffusant 50 cha�nes fran�aises et internationales. Son �quipement grand confort avec climatisation r�versible, minibar, coffre-fort, bureau, dressing et un acc�s wi-fi gratuit ainsi que sa magnifique salle de bain avec douche � l'Italienne et � jets, vous donne l'assurance de passer un agr�able s�jour. Possibilit� de 2 lits s�par�s sur demande.");
		session.save(cat5);
		Categorie cat6 = new Categorie();
		cat6.setLabelCatgorie("Chambre avec Suppl�ment Terrasse Priv�e");
		cat6.setDescriptionCatgorie("Quelque soit la cat�gorie de chambre que vous avez choisi de nous r�server, HARMONY, TRADITION, TRIPLE ou FAMILIALE, vous pouvez disposer, avec suppl�ment de prix, d'une chambre donnant sur une belle et grande terrasse priv�e avec fauteuils, relax et table basse, couverte de parasol ou de tonnelle.Vu le peu de chambre de ce type dont nous disposons, il est imp�ratif d'en faire la demande directement � l'h�tel par mail ou t�l�phone.Seule la r�ponse de l'h�tel, par un mail de confirmation, peut en garantir la r�servation.Une confirmation de l'h�tel fa�te par t�l�phone n'a aucune valeur.En cas de non r�ponse de l'h�tel, vous devez r�it�rer votre demande et surtout ne pas consid�rer que votre demande a �t� prise en compte.Le montant du suppl�ment est le suivant:25 euros par jour du 1er mai au 30 septembre 15 euros par jour en avril et octobre 10 euros par jour du 1er novembre au 31 mars Ces tarifs sont identiques quelque soit la cat�gorie de chambre choisie.   ");
		session.save(cat6);
	
		/*types chambres*/
		Typechambre tc1=new Typechambre();
		tc1.setDescriptionType("CHAMBRE JARDIN");
		session.save(tc1);
		Typechambre tc2=new Typechambre();
		tc2.setDescriptionType("CHAMBRE VUE MER");
		session.save(tc2);
		Typechambre tc3=new Typechambre();
		tc3.setDescriptionType("STUDIO VUE MER");
		session.save(tc3);
		Typechambre tc4=new Typechambre();
		tc4.setDescriptionType("Autre");
		session.save(tc4);
		
		
		
		
		
		
		/*pension*/
		Pension pens1=new Pension();
		pens1.setLabelPension("Tout Inclus / All Inclusive");
		pens1.setDescriptionPension("cette formule comprend l'h�bergement, les repas avec boisson (eau min�rale, jus de fruits, sodas, vins, alcool locaux). Certains alcools, ainsi que les boissons hors repas, peuvent ne pas �tre compris dans la formule et faire l'objet d'une facturation additionnelle par l'h�telier.");
		session.save(pens1);
		Pension pens2=new Pension();
		pens2.setLabelPension("Pension compl�te");
		pens2.setDescriptionPension(" cette formule comprend l'h�bergement et tous les repas (g�n�ralement hors boisson)");
		session.save(pens2);
		Pension pens3=new Pension();
		pens3.setLabelPension("Demi-pension");
		pens3.setDescriptionPension("cette formule comprend l'h�bergement, les petits d�jeuners et d�jeuners ou d�ners selon les cas, sans les boissons.");
		session.save(pens3);
		Pension pens4=new Pension();
		pens4.setLabelPension("Petit-d�jeuner");
		pens4.setDescriptionPension(" cette formule comprend l'h�bergement et les petits d�jeuners. Les boissons ne sont pas incluses dans les prix, sauf indication contraire.");
		session.save(pens4);
		
		/*role*/
		Role admin=new Role();
		admin.setDescriptionRole("ADMIN");
		session.save(admin);
		Role client=new Role();
		client.setDescriptionRole("CLIENT");
		session.save(client);
		Role agent=new Role();
		agent.setDescriptionRole("AGENT");
		session.save(agent);
		
		/*Utilisateur*/
		Utilisateur user1=new Utilisateur();
		user1.setLogin("admin");
		user1.setEmailPers("admin");
		user1.setMotDePass("b59c67bf196a4758191e42f76670ceba");//MD5 de mot de pass : 1111
		user1.setAdressePers("RUE 5");
		user1.setEnabled(true);
		user1.setAccountNonExpired(true);
		user1.setAccountNonLocked(true);
		user1.setEnabled(true);
		user1.setVillePers("Monastir");
		List<Role> lr1=new ArrayList<Role>();
		lr1.add(admin);
		user1.setAuthorities(lr1);
		session.save(user1);
		
		Utilisateur user12=new Utilisateur();
		user12.setLogin("admin1");
		user12.setEmailPers("admin1");
		user12.setMotDePass("b59c67bf196a4758191e42f76670ceba");//MD5 de mot de pass : 1111
		user12.setAdressePers("RUE 66");
		user12.setEnabled(true);
		user12.setAccountNonExpired(true);
		user12.setAccountNonLocked(true);
		user12.setEnabled(true);
		user12.setVillePers("Monastir");
		List<Role> lr12=new ArrayList<Role>();
		lr12.add(admin);
		user1.setAuthorities(lr12);
		session.save(user12);
		
		Utilisateur user2=new Utilisateur();
		user2.setLogin("client");
		user2.setEmailPers("client");
		user2.setMotDePass("b59c67bf196a4758191e42f76670ceba");//MD5 de mot de pass : 1111
		user2.setAdressePers("RUE 4");
		user2.setEnabled(true);
		user2.setAccountNonExpired(true);
		user2.setAccountNonLocked(true);
		user2.setEnabled(true);
		user2.setVillePers("Monastir");
		List<Role> lr2=new ArrayList<Role>();
		lr2.add(client);
		user2.setAuthorities(lr2);
		session.save(user2);
		

		Utilisateur user22=new Utilisateur();
		user22.setLogin("admin3");
		user22.setEmailPers("admin3");
		user22.setMotDePass("b59c67bf196a4758191e42f76670ceba");//MD5 de mot de pass : 1111
		user22.setAdressePers("RUE 45");
		user22.setEnabled(true);
		user22.setAccountNonExpired(true);
		user22.setAccountNonLocked(true);
		user22.setEnabled(true);
		user22.setVillePers("Monastir");
		List<Role> lr22=new ArrayList<Role>();
		lr22.add(admin);
		user22.setAuthorities(lr22);
		session.save(user22);
		
		Utilisateur user3=new Utilisateur();
		user3.setLogin("agent");
		user3.setEmailPers("agent");
		user3.setMotDePass("b59c67bf196a4758191e42f76670ceba");//MD5 de mot de pass : 1111
		user3.setAdressePers("RUE 3");
		user3.setEnabled(true);
		user3.setAccountNonExpired(true);
		user3.setAccountNonLocked(true);
		user3.setEnabled(true);
		user3.setVillePers("Monastir");
		List<Role> lr3=new ArrayList<Role>();
		lr3.add(agent);
		user2.setAuthorities(lr3);
		session.save(user3);
		
		
		
		
		
		
		
		/*hotels*/
		Hotel hot1=new Hotel();
		hot1.setNomHotel("Neptunia Beach");
		hot1.setDescriptionHotel("Offering an outdoor pool and a restaurant, Neptunia Beach is located in Monastir. Free Wi-Fi access is available. At Neptunia Beach you will find a private beach area and a tennis court.");
		hot1.setCodePostalHotel(1000);
		hot1.setDirecteur(user1);
		hot1.setFaxHotel("3554585");
		session.save(hot1);
		
		Hotel hot2=new Hotel();
		hot2.setNomHotel("Delphin Ribat 3-star hotel");
		hot2.setDescriptionHotel("The hotel Delphin Ribat is located 800 meters from the hotel's private beach and 5 kilometres from Monastir Marina.");
		hot2.setCodePostalHotel(1000);
		hot2.setDirecteur(user1);
		hot2.setFaxHotel("7355545485");
		session.save(hot2);
		
		Hotel hot3=new Hotel();
		hot3.setNomHotel("Caribbean World Monastir - All Inclusive");
		hot3.setDescriptionHotel("Situated next to the beach, Club Caribbean World Monastir Resort is set in large gardens and offers excellent family entertainment, its own water park and complimentary breakfast.");
		hot3.setCodePostalHotel(1000);
		hot3.setDirecteur(user22);
		hot3.setFaxHotel("735554548");
		session.save(hot3);
		
		
		
		
		
		
		
		/*Chambre*/
		Chambre c1 = new Chambre();
		c1.setCategorie(cat1);
		c1.setTypechambre(tc1);
		c1.setActiver(true);
		c1.setNumChambre(1);
		c1.setTelChambre(104);
		session.save(c1);
		
		Chambre c2 = new Chambre();
		c2.setCategorie(cat2);
		c1.setTypechambre(tc3);
		c2.setActiver(true);
		c2.setNumChambre(1);
		c2.setTelChambre(145);
		session.save(c2);
		
		Chambre c3 = new Chambre();
		c3.setCategorie(cat2);
		c1.setTypechambre(tc2);
		c3.setActiver(true);
		c3.setNumChambre(1);
		c3.setTelChambre(144);
		session.save(c3);
		
		Chambre c4 = new Chambre();
		c4.setCategorie(cat3);
		c1.setTypechambre(tc1);
		c4.setActiver(true);
		c4.setNumChambre(1);
		c4.setTelChambre(143);
		session.save(c4);
		
		Chambre c5 = new Chambre();
		c5.setCategorie(cat4);
		c5.setActiver(true);
		c5.setNumChambre(1);
		c5.setTelChambre(144);
		session.save(c5);
		
		/*saisons*/
		Saison s1=new Saison();
		s1.setDescriptionSaison("Basse saison hiver");
		//s1.setDateDebutSaison(dateDebutSaison);
		//s1.setDateFinSaison(dateFinSaison);
		session.save(s1);
		
		Saison s2=new Saison();
		s2.setDescriptionSaison("Haute saison hiver");
		//s2.setDateDebutSaison(dateDebutSaison);
		//s2.setDateFinSaison(dateFinSaison);
		session.save(s2);
		
		Saison s3=new Saison();
		s3.setDescriptionSaison("Haute saison �t�");
		//s3.setDateDebutSaison(dateDebutSaison);
		//s3.setDateFinSaison(dateFinSaison);
		session.save(s3);
		
		Saison s4=new Saison();
		s4.setDescriptionSaison("Vacances de la Toussaint");
		//s4.setDateDebutSaison(dateDebutSaison);
		//s4.setDateFinSaison(dateFinSaison);
		session.save(s4);
		
		Saison s5=new Saison();
		s5.setDescriptionSaison("Vacances de Printemps");
		//s5.setDateDebutSaison(dateDebutSaison);
		//s5.setDateFinSaison(dateFinSaison);
		session.save(s5);
		
		Saison s6=new Saison();
		s6.setDescriptionSaison("Vacances zone A");
		//s6.setDateDebutSaison(dateDebutSaison);
		//s6.setDateFinSaison(dateFinSaison);
		session.save(s6);
		
		Saison s7=new Saison();
		s7.setDescriptionSaison("Semaine de No�l");
		//s7.setDateDebutSaison(dateDebutSaison);
		//s7.setDateFinSaison(dateFinSaison);
		session.save(s7);
		
		Saison s8=new Saison();
		s8.setDescriptionSaison("Basse saison �t�");
		//s8.setDateDebutSaison(dateDebutSaison);
		//s8.setDateFinSaison(dateFinSaison);
		session.save(s8);
		
		Saison s9=new Saison();
		s9.setDescriptionSaison("Vacances zone B");
		//s9.setDateDebutSaison(dateDebutSaison);
		//s9.setDateFinSaison(dateFinSaison);
		session.save(s9);
		
		Saison s10=new Saison();
		s10.setDescriptionSaison("Vacances de No�l");
		//s9.setDateDebutSaison(dateDebutSaison);
		//s9.setDateFinSaison(dateFinSaison);
		session.save(s10);
		
		Saison s11=new Saison();
		s11.setDescriptionSaison("Moyenne saison �t�");
		//s9.setDateDebutSaison(dateDebutSaison);
		//s9.setDateFinSaison(dateFinSaison);
		session.save(s11);
		
		Saison s12=new Saison();
		s12.setDescriptionSaison("Vacances zone C");
		//s9.setDateDebutSaison(dateDebutSaison);
		//s9.setDateFinSaison(dateFinSaison);
		session.save(s12);
		
		
		/*offres*/
		
		Offre o1=new Offre();
		o1.setChambre(c1);
		o1.setHotel(hot1);
		o1.setPension(pens1);
		o1.setPrixOffre(80);
		o1.setSaison(s11);
		session.save(o1);
		
		Offre o4=new Offre();
		o4.setChambre(c3);
		o4.setHotel(hot3);
		o4.setPension(pens4);
		o4.setPrixOffre(70);
		o4.setSaison(s2);
		session.save(o4);
		
		Offre o2=new Offre();
		o2.setChambre(c4);
		o2.setHotel(hot1);
		o2.setPension(pens2);
		o2.setPrixOffre(120);
		o2.setSaison(s10);
		session.save(o2);
		
		Offre o3=new Offre();
		o3.setChambre(c1);
		o3.setHotel(hot2);
		o3.setPension(pens1);
		o3.setPrixOffre(60);
		o3.setSaison(s5);
		session.save(o3);
		
		
		/*reservations*/
		
		Reservation r1=new Reservation();
		List<Chambre> lc1 =new ArrayList<Chambre>();
		lc1.add(c1);
		r1.setChambres(lc1);
		r1.setNbPersonne(8);
		r1.setClient(user3);
		r1.setAgent(user1);
		r1.setArrivee(true);
		session.save(r1);
		
		Reservation r2=new Reservation();
		List<Chambre> lc2 =new ArrayList<Chambre>();
		lc2.add(c2);
		r2.setChambres(lc2);
		r2.setNbPersonne(8);
		r2.setArrivee(true);
		r1.setClient(user3);
		r1.setAgent(user1);
		session.save(r2);
		
		Reservation r3=new Reservation();
		List<Chambre> lc3 =new ArrayList<Chambre>();
		lc3.add(c3);
		r3.setChambres(lc3);
		r3.setNbPersonne(4);
		r3.setArrivee(false);
		r1.setClient(user3);
		r1.setAgent(user1);
		session.save(r3);
		
		Reservation r4=new Reservation();
		List<Chambre> lc4 =new ArrayList<Chambre>();
		lc4.add(c1);
		lc4.add(c2);
		lc4.add(c3);
		r4.setChambres(lc4);
		r4.setNbPersonne(8);
		r4.setArrivee(true);
		r4.setClient(user3);
		r4.setAgent(user1);
		session.save(r4);
		
		Reservation r5=new Reservation();
		List<Chambre> lc5 =new ArrayList<Chambre>();
		lc5.add(c5);
		r5.setChambres(lc5);
		r5.setNbPersonne(4);
		r5.setArrivee(false);
		r5.setClient(user3);
		r5.setAgent(user1);
		session.save(r5);
		
		
		
		
		
		
		
		
		
		
		
		
		/*List<Chambre> lc=new ArrayList<Chambre>();
		lc.add(c);
		cat2.setChambres(lc);
		session.save(cat2);*/
		
		
		
		
		
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
		
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * SessionFactory sessionFactory = null; try { sessionFactory = new
	 * Configuration().configure().buildSessionFactory(); System.err.println(
	 * "Initial SessionFactory succes "); } catch (Throwable ex) {
	 * System.err.println("Initial SessionFactory creation failed. " + ex);
	 * ex.printStackTrace(); }
	 * 
	 * Session session = sessionFactory.getCurrentSession(); // Here you are
	 * trying to access the Session which is not even created // TODO
	 * Auto-generated method stub Chambre g=new Chambre(); g.setNumChambre(45);
	 * session.persist(g); // g.setTel_chambre(477); // Categorie c=new
	 * Categorie(); // g.setCategorie(c); // g.getCategorie().getDescription();
	 * // Client c1=new Client(); // c1.getReservations().get(3).getChambres();
	 * }
	 */

}
