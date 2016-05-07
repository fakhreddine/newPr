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

import gestionreservation.spring.model.Pension;
import gestionreservation.spring.service.PensionService;

@Controller
public class PensionController {
	@Autowired
	@Qualifier(value = "utilisateurServiceImpl")
	private UserDetailsService utilisateurService;

	public void setUtilisateurService(UserDetailsService ps) {
		this.utilisateurService = ps;
	}
	private PensionService pensionService;
	
	@Autowired(required=true)
	@Qualifier(value="pensionService")
	public void setPensionService(PensionService ps){
		this.pensionService = ps;
	}
	
	@RequestMapping(value = "/pensions", method = RequestMethod.GET)
	public String listPensions(Model model) {
		model.addAttribute("pension", new Pension());
		model.addAttribute("listPensions", this.pensionService.listPensions());
		return "pension";
	}
	
	//For add and update person both
	@RequestMapping(value= "/pension/add", method = RequestMethod.POST)
	
	public String addPension(@ModelAttribute("pension") Pension p) {
	//public String addPension(@ModelAttribute("pension") Pension p){
		
		if(p.getIdPension() == 0){
			//new person, add it
			this.pensionService.addPension(p);
		}else{
			//existing person, call update
			this.pensionService.updatePension(p);
		}
		
		return "redirect:/pensions";
		
	}
	
	@RequestMapping("/pension/{idPension}/remove")
    public String removePension(@PathVariable("idPension") int id){
		
        this.pensionService.removePension(id);
        return "redirect:/pensions";
    }
 
    @RequestMapping("/pension/{idPension}/edit")
    public String editPension(@PathVariable("idPension") int id, Model model){
        model.addAttribute("pension", this.pensionService.getPensionById(id));
        model.addAttribute("listPensions", this.pensionService.listPensions());
        return "pension";
    }
	
}
