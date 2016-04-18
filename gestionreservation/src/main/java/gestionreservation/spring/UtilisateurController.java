package gestionreservation.spring;

import java.math.BigInteger;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gestionreservation.spring.model.Utilisateur;
import gestionreservation.spring.model.Utilisateur;
import gestionreservation.spring.service.UtilisateurService;

@Controller
public class UtilisateurController {
	
	private UtilisateurService utilisateurService;
	
	@Autowired(required=true)
	@Qualifier(value="utilisateurService")
	public void setUtilisateurService(UtilisateurService ps){
		this.utilisateurService = ps;
	}
	
	@RequestMapping(value = "/utilisateurs", method = RequestMethod.GET)
	public String listUtilisateurs(Model model) {
		model.addAttribute("utilisateur", new Utilisateur());
		model.addAttribute("listUtilisateurs", this.utilisateurService.listUtilisateurs());
		return "utilisateur";
	}
	
	//For add and update person both
	@RequestMapping(value= "/utilisateur/add", method = RequestMethod.POST)
	
	public String addUtilisateur(@ModelAttribute("utilisateur") Utilisateur p) {
	//public String addUtilisateur(@ModelAttribute("utilisateur") Utilisateur p){
		//BigInteger idUtilisateur=(long)0;
		//if(p.getIdUtilisateur() == 0){
			//new person, add it
			this.utilisateurService.addUtilisateur(p);
		//}else{
			//existing person, call update
			this.utilisateurService.updateUtilisateur(p);
		//}
		
		return "redirect:/utilisateurs";
		
	}
	
	@RequestMapping("/utilisateur/{idUtilisateur}/remove")
    public String removeUtilisateur(@PathVariable("idUtilisateur") int id){
		
        this.utilisateurService.removeUtilisateur(id);
        return "redirect:/utilisateurs";
    }
 
    @RequestMapping("/utilisateur/{idUtilisateur}/edit")
    public String editUtilisateur(@PathVariable("idUtilisateur") int id, Model model){
        model.addAttribute("utilisateur", this.utilisateurService.getUtilisateurById(id));
        model.addAttribute("listUtilisateurs", this.utilisateurService.listUtilisateurs());
        return "utilisateur";
    }
	
}
