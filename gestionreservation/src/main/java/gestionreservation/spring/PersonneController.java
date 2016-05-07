package gestionreservation.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gestionreservation.spring.model.Personne;
import gestionreservation.spring.service.PersonneService;

@Controller
public class PersonneController {
	@Autowired
	@Qualifier(value = "utilisateurServiceImpl")
	private UserDetailsService utilisateurService;

	public void setUtilisateurService(UserDetailsService ps) {
		this.utilisateurService = ps;
	}
	private PersonneService personneService;
	
	@Autowired(required=true)
	@Qualifier(value="personneService")
	public void setPersonneService(PersonneService ps){
		this.personneService = ps;
	}
	
	@RequestMapping(value = "/personnes", method = RequestMethod.GET)
	public String listPersonnes(Model model) {
		model.addAttribute("personne", new Personne());
		model.addAttribute("listPersonnes", this.personneService.listPersonnes());
		return "personnes";
	}
	
	//For add and update person both
	@RequestMapping(value= "/personne/add", method = RequestMethod.POST)
	
	public String addPersonne(@ModelAttribute("personne") Personne p) {
	//public String addPersonne(@ModelAttribute("personne") Personne p){
		
		if(p.getIdPersonne() == "0"){
			//new person, add it
			this.personneService.addPersonne(p);
		}else{
			//existing person, call update
			this.personneService.updatePersonne(p);
		}
		
		return "redirect:/personnes";
		
	}
	
	@RequestMapping("/personne/{idPersonne}/remove")
    public String removePersonne(@PathVariable("idPersonne") int id){
		
        this.personneService.removePersonne(id);
        return "redirect:/personnes";
    }
 
    @RequestMapping("/personne/{idPersonne}/edit")
    public String editPersonne(@PathVariable("idPersonne") int id, Model model){
        model.addAttribute("personne", this.personneService.getPersonneById(id));
        model.addAttribute("listPersonnes", this.personneService.listPersonnes());
        return "personne";
    }
	
}
