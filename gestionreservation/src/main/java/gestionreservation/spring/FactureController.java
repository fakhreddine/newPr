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

import gestionreservation.spring.model.Facture;
import gestionreservation.spring.service.FactureService;

@Controller
public class FactureController {
	@Autowired
	@Qualifier(value = "utilisateurServiceImpl")
	private UserDetailsService utilisateurService;

	public void setUtilisateurService(UserDetailsService ps) {
		this.utilisateurService = ps;
	}
	private FactureService factureService;
	
	@Autowired(required=true)
	@Qualifier(value="factureService")
	public void setFactureService(FactureService ps){
		this.factureService = ps;
	}
	
	@RequestMapping(value = "/factures", method = RequestMethod.GET)
	public String listFactures(Model model) {
		model.addAttribute("facture", new Facture());
		model.addAttribute("listFactures", this.factureService.listFactures());
		return "facture";
	}
	
	//For add and update person both
	@RequestMapping(value= "/facture/add", method = RequestMethod.POST)
	
	public String addFacture(@ModelAttribute("facture") Facture p) {
	//public String addFacture(@ModelAttribute("facture") Facture p){
		
		if(p.getIdFacture() == "0"){
			//new person, add it
			this.factureService.addFacture(p);
		}else{
			//existing person, call update
			this.factureService.updateFacture(p);
		}
		
		return "redirect:/factures";
		
	}
	
	@RequestMapping("/facture/{idFacture}/remove")
    public String removeFacture(@PathVariable("idFacture") int id){
		
        this.factureService.removeFacture(id);
        return "redirect:/factures";
    }
 
    @RequestMapping("/facture/{idFacture}/edit")
    public String editFacture(@PathVariable("idFacture") int id, Model model){
        model.addAttribute("facture", this.factureService.getFactureById(id));
        model.addAttribute("listFactures", this.factureService.listFactures());
        return "facture";
    }
	
}
