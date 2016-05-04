package gestionreservation.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gestionreservation.spring.model.Offre;
import gestionreservation.spring.service.OffreService;

@Controller
public class OffreController {
	
	private OffreService offreService;
	
	@Autowired(required=true)
	@Qualifier(value="offreService")
	public void setOffreService(OffreService ps){
		this.offreService = ps;
	}
	
	@RequestMapping(value = "/off", method = RequestMethod.GET)
	public String listOffres(Model model) {
		model.addAttribute("offre", new Offre());
		model.addAttribute("listOffres", this.offreService.listOffres());
		return "offre";
	}
	

	@RequestMapping(value = "/offres", method = RequestMethod.GET)
	public String lOffres(Model model) {
		model.addAttribute("listOffres", this.offreService.listOffres());
		return "offres";
	}
	@RequestMapping("/offre/{idOffre}")
    public String getoffre(@PathVariable("idOffre") String id, Model model){
        model.addAttribute("offre", this.offreService.getOffreById(id));
        return "offre";
    }
	
	
	//For add and update person both
	@RequestMapping(value= "/offre/add", method = RequestMethod.POST)
	
	public String addOffre(@ModelAttribute("offre") Offre p) {
	//public String addOffre(@ModelAttribute("offre") Offre p){
		
		if(p.getIdOffre() == "0"){
			//new person, add it
			this.offreService.addOffre(p);
		}else{
			//existing person, call update
			this.offreService.updateOffre(p);
		}
		
		return "redirect:/offres";
		
	}
	
	@RequestMapping("/offre/{idOffre}/remove")
    public String removeOffre(@PathVariable("idOffre") int id){
		
        this.offreService.removeOffre(id);
        return "redirect:/offres";
    }
 
    @RequestMapping("/offre/{idOffre}/edit")
    public String editOffre(@PathVariable("idOffre") int id, Model model){
    //    model.addAttribute("offre", this.offreService.getOffreById(id));
        model.addAttribute("listOffres", this.offreService.listOffres());
        return "offre";
    }
	
}
