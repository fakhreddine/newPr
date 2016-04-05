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

import gestionreservation.spring.model.Chambre;
import gestionreservation.spring.model.Chambre;
import gestionreservation.spring.service.ChambreService;

@Controller
public class ChambreController {
	
	private ChambreService chambreService;
	
	@Autowired(required=true)
	@Qualifier(value="chambreService")
	public void setChambreService(ChambreService ps){
		this.chambreService = ps;
	}
	
	@RequestMapping(value = "/chambres", method = RequestMethod.GET)
	public String listChambres(Model model) {
		model.addAttribute("chambre", new Chambre());
		model.addAttribute("listChambres", this.chambreService.listChambres());
		return "chambre";
	}
	
	//For add and update person both
	@RequestMapping(value= "/chambre/add", method = RequestMethod.POST)
	
	public String addChambre(@ModelAttribute("chambre") Chambre p) {
	//public String addChambre(@ModelAttribute("chambre") Chambre p){
		
		if(p.getIdChambre() == 0){
			//new person, add it
			this.chambreService.addChambre(p);
		}else{
			//existing person, call update
			this.chambreService.updateChambre(p);
		}
		
		return "redirect:/chambres";
		
	}
	
	@RequestMapping("/chambre/{idChambre}/remove")
    public String removeChambre(@PathVariable("idChambre") int id){
		
        this.chambreService.removeChambre(id);
        return "redirect:/chambres";
    }
 
    @RequestMapping("/chambre/{idChambre}/edit")
    public String editChambre(@PathVariable("idChambre") int id, Model model){
        model.addAttribute("chambre", this.chambreService.getChambreById(id));
        model.addAttribute("listChambres", this.chambreService.listChambres());
        return "chambre";
    }
	
}
