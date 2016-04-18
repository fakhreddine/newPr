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

import gestionreservation.spring.model.Serviceconsommation;
import gestionreservation.spring.model.Serviceconsommation;
import gestionreservation.spring.service.ServiceconsommationService;

@Controller
public class ServiceconsommationController {
	
	private ServiceconsommationService serviceconsommationService;
	
	@Autowired(required=true)
	@Qualifier(value="serviceconsommationService")
	public void setServiceconsommationService(ServiceconsommationService ps){
		this.serviceconsommationService = ps;
	}
	
	@RequestMapping(value = "/serviceconsommations", method = RequestMethod.GET)
	public String listServiceconsommations(Model model) {
		model.addAttribute("serviceconsommation", new Serviceconsommation());
		model.addAttribute("listServiceconsommations", this.serviceconsommationService.listServiceconsommations());
		return "serviceconsommation";
	}
	
	//For add and update person both
	@RequestMapping(value= "/serviceconsommation/add", method = RequestMethod.POST)
	
	public String addServiceconsommation(@ModelAttribute("serviceconsommation") Serviceconsommation p) {
	//public String addServiceconsommation(@ModelAttribute("serviceconsommation") Serviceconsommation p){
		
		if(p.getIdService() == "0"){
			//new person, add it
			this.serviceconsommationService.addServiceconsommation(p);
		}else{
			//existing person, call update
			this.serviceconsommationService.updateServiceconsommation(p);
		}
		
		return "redirect:/serviceconsommations";
		
	}
	
	@RequestMapping("/serviceconsommation/{idServiceconsommation}/remove")
    public String removeServiceconsommation(@PathVariable("idServiceconsommation") int id){
		
        this.serviceconsommationService.removeServiceconsommation(id);
        return "redirect:/serviceconsommations";
    }
 
    @RequestMapping("/serviceconsommation/{idServiceconsommation}/edit")
    public String editServiceconsommation(@PathVariable("idServiceconsommation") int id, Model model){
        model.addAttribute("serviceconsommation", this.serviceconsommationService.getServiceconsommationById(id));
        model.addAttribute("listServiceconsommations", this.serviceconsommationService.listServiceconsommations());
        return "serviceconsommation";
    }
	
}
