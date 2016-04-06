import gestionreservation.spring.model.Categorie;
import gestionreservation.spring.model.Chambre;
import gestionreservation.spring.model.Client;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chambre g=new Chambre();
		g.setNumChambre(45);
		g.setTel_chambre(477);
		Categorie c=new Categorie();
		g.setCategorie(c);
		g.getCategorie().getDescription();
		Client c1=new Client();
		c1.getReservations().get(3).getChambres();
	}

}
