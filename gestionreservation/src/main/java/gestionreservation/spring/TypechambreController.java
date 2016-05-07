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

import gestionreservation.spring.model.Typechambre;
import gestionreservation.spring.service.TypechambreService;

@Controller
public class TypechambreController {
	@Autowired
	@Qualifier(value = "utilisateurServiceImpl")
	private UserDetailsService utilisateurService;

	public void setUtilisateurService(UserDetailsService ps) {
		this.utilisateurService = ps;
	}
	private TypechambreService typechambreService;
	
	@Autowired(required=true)
	@Qualifier(value="typechambreService")
	public void setTypechambreService(TypechambreService ps){
		this.typechambreService = ps;
	}
	
	@RequestMapping(value = "/typechambres", method = RequestMethod.GET)
	public String listTypechambres(Model model) {
		model.addAttribute("typechambre", new Typechambre());
		model.addAttribute("listTypechambres", this.typechambreService.listTypechambres());
		return "typechambre";
	}
	
	//For add and update person both
	@RequestMapping(value= "/typechambre/add", method = RequestMethod.POST)
	
	public String addTypechambre(@ModelAttribute("typechambre") Typechambre p) {
	//public String addTypechambre(@ModelAttribute("typechambre") Typechambre p){
		
		if(p.getIdType() == 0){
			//new person, add it
			this.typechambreService.addTypechambre(p);
		}else{
			//existing person, call update
			this.typechambreService.updateTypechambre(p);
		}
		
		return "redirect:/typechambres";
		
	}
	
	@RequestMapping("/typechambre/{idTypechambre}/remove")
    public String removeTypechambre(@PathVariable("idTypechambre") int id){
		
        this.typechambreService.removeTypechambre(id);
        return "redirect:/typechambres";
    }
 
    @RequestMapping("/typechambre/{idTypechambre}/edit")
    public String editTypechambre(@PathVariable("idTypechambre") int id, Model model){
        model.addAttribute("typechambre", this.typechambreService.getTypechambreById(id));
        model.addAttribute("listTypechambres", this.typechambreService.listTypechambres());
        return "typechambre";
    }
	
}
