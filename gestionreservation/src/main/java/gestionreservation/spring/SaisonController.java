package gestionreservation.spring;

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

import gestionreservation.spring.model.Saison;
import gestionreservation.spring.model.Saison;
import gestionreservation.spring.service.SaisonService;

@Controller
public class SaisonController {
	
	private SaisonService saisonService;
	
	@Autowired(required=true)
	@Qualifier(value="saisonService")
	public void setSaisonService(SaisonService ps){
		this.saisonService = ps;
	}
	
	@RequestMapping(value = "/saisons", method = RequestMethod.GET)
	public String listSaisons(Model model) {
		model.addAttribute("saison", new Saison());
		model.addAttribute("listSaisons", this.saisonService.listSaisons());
		return "saison";
	}
	
	//For add and update person both
	@RequestMapping(value= "/saison/add", method = RequestMethod.POST)
	
	public String addSaison(@ModelAttribute("saison") Saison p) {
	//public String addSaison(@ModelAttribute("saison") Saison p){
		
		if(p.getIdSaison() == 0){
			//new person, add it
			this.saisonService.addSaison(p);
		}else{
			//existing person, call update
			this.saisonService.updateSaison(p);
		}
		
		return "redirect:/saisons";
		
	}
	
	@RequestMapping("/saison/{idSaison}/remove")
    public String removeSaison(@PathVariable("idSaison") int id){
		
        this.saisonService.removeSaison(id);
        return "redirect:/saisons";
    }
 
    @RequestMapping("/saison/{idSaison}/edit")
    public String editSaison(@PathVariable("idSaison") int id, Model model){
        model.addAttribute("saison", this.saisonService.getSaisonById(id));
        model.addAttribute("listSaisons", this.saisonService.listSaisons());
        return "saison";
    }
	
}
