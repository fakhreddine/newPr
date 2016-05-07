package gestionreservation.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gestionreservation.spring.model.Chambre;
import gestionreservation.spring.model.Pension;
import gestionreservation.spring.model.Role;
import gestionreservation.spring.model.Utilisateur;
import gestionreservation.spring.service.ChambreService;
import gestionreservation.spring.service.HotelService;
import gestionreservation.spring.service.OffreService;
import gestionreservation.spring.service.PensionService;

@Controller
public class HomeController {
	@Autowired
	@Qualifier(value = "utilisateurServiceImpl")
	private UserDetailsService utilisateurService;

	public void setUtilisateurService(UserDetailsService ps) {
		this.utilisateurService = ps;
	}
	@Autowired
	@Qualifier(value = "offreService")
	private OffreService offreService;
	@Autowired
	@Qualifier(value = "hotelService")
	private HotelService hotelService;
	@Autowired
	@Qualifier(value = "chambreService")
	private ChambreService chambreService;
	@Autowired
	@Qualifier(value = "pensionService")
	private PensionService pensionService;

	public void setOffreService(OffreService ps) {
		this.offreService = ps;
	}
	public void setHotelService(HotelService ps) {
		this.hotelService = ps;
	}
	public void setPensionService(PensionService ps) {
		this.pensionService = ps;
	}
	public void setChambreService(ChambreService ps) {
		this.chambreService = ps;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("pension", new Pension());
		model.addAttribute("listPensions", this.pensionService.listPensions());
		return "index";
	}
	@RequestMapping(value = "/hotes", method = RequestMethod.GET)
	public String hotels(Model model) {
		model.addAttribute("chambre", new Chambre());
		model.addAttribute("listChambres", this.chambreService.listChambres());
		return "index";
	}
	@RequestMapping(value = "/offrs", method = RequestMethod.GET)
	public String offres(Model model) {
		return "index";
	}
	@RequestMapping(value = "/ad", method = RequestMethod.GET)
	public String ad(Model model) {
		return "admin/index";
	}
	
	@RequestMapping(value = "/Copiezero", method = RequestMethod.GET)
	public String copie(Model model) {
		return "Copie_zero";
	}


/*
	@RequestMapping(value = "/inscription1", method = RequestMethod.GET)
	public String testinscription(Model model) {
		return "testinscription";
	}

	@RequestMapping(value = "/booking", method = RequestMethod.GET)
	public String booking(Model model) {
		return "booking";
	}

	// For add and update person both
	@RequestMapping(value = "/utilisateur/add", method = RequestMethod.POST)

	public String addUtilisateur(@ModelAttribute("utilisateur") Utilisateur p) {
		// public String addUtilisateur(@ModelAttribute("utilisateur")
		// Utilisateur p){
		// BigInteger idUtilisateur=(long)0;
		// if(p.getIdUtilisateur() == 0){
		// new person, add it
		// this.utilisateurService.addUtilisateur(p);
		// }else{
		// existing person, call update
		// this.utilisateurService.updateUtilisateur(p);
		// }

		return "redirect:/utilisateurs";

	}

	@RequestMapping("/utilisateur/{idUtilisateur}/remove")
	public String removeUtilisateur(@PathVariable("idUtilisateur") int id) {

		// this.utilisateurService.removeUtilisateur(id);
		return "redirect:/utilisateurs";
	}

	@RequestMapping("/utilisateur/{idUtilisateur}/edit")
	public String editUtilisateur(@PathVariable("idUtilisateur") int id, Model model) {
		// model.addAttribute("utilisateur",
		// this.utilisateurService.getUtilisateurById(id));
		// model.addAttribute("listUtilisateurs",
		// this.utilisateurService.listUtilisateurs());
		return "utilisateur";
	}

	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public String helloWorld(ModelMap model) {

		/*
		 * Object principal =
		 * SecurityContextHolder.getContext().getAuthentication().getPrincipal()
		 * ; User user=null; if (principal instanceof User) { user =
		 * ((User)principal); }
		 */
		// String name = user.getUsername();
		// model.addAttribute("username", name);
	/*	model.addAttribute("message", "Welcome to the Hello World page");
		return "helloworld";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {

		return "login";

	}

	@RequestMapping(value = "/secured/home", method = RequestMethod.GET)
	public String securedHome(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		Utilisateur user = null;
		if (principal instanceof Utilisateur) {
			user = ((Utilisateur) principal);
		}

		String name = user.getUsername();
		model.addAttribute("username", name);
		model.addAttribute("message", "Welcome to the secured page");
		return "home";

	}

	@RequestMapping(value = "/loginError", method = RequestMethod.GET)
	public String loginError(ModelMap model) {
		model.addAttribute("error", "true");
		model.addAttribute("msg", "invalid login credentials");
		return "login";

	}
	
	@RequestMapping(value = "/i1", method = RequestMethod.GET)
	public String initialise(Model model) {
    	Utilisateur user = new Utilisateur();
      user.setPrenomPers("firstName");
      user.setNomPers("lastName");
      user.setLogin("user");
      user.setEmailPers("user");
      user.setMotDePass("1111");
      Role r = new Role();
      r.setDescriptionRole("Admin");
      List<Role> roles = new ArrayList<Role>();
      roles.add(r);
      user.setAuthorities(roles);
    //  this.utilisateurService.addUtilisateur(user);
      return "hotel";
	}
*/
}
