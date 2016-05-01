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

import gestionreservation.spring.model.Role;
import gestionreservation.spring.model.Utilisateur;

@Controller
public class UtilisateurController {
	@Autowired
	@Qualifier(value = "utilisateurServiceImpl")
	private UserDetailsService utilisateurService;

	public void setUtilisateurService(UserDetailsService ps) {
		this.utilisateurService = ps;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String accueil(Model model) {
		return "index";
	}

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
		model.addAttribute("message", "Welcome to the Hello World page");
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

}
