package gestionreservation.spring;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gestionreservation.spring.model.Client;
import gestionreservation.spring.service.ClientService;

@Controller
public class ClientController {
	
	private ClientService clientService;
	
	@Autowired(required=true)
	@Qualifier(value="clientService")
	public void setClientService(ClientService ps){
		this.clientService = ps;
	}
	@RequestMapping(value = "/inscription", method = RequestMethod.GET)
	public String inscription(Model model) {
		model.addAttribute("client", new Client());
		return "inscription";
	}
	@RequestMapping(value = "/sing_in", method = RequestMethod.GET)
	public String sing_in(@ModelAttribute("client") Client p) {
		if(p.getIdClient() == BigInteger.ZERO){
			//new client, add it
				this.clientService.addClient(p);
		}else{
				//existing client, call update
				this.clientService.updateClient(p);
			}
		
			return "redirect:/clients";
	}
	
	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	public String listClients(Model model) {
		model.addAttribute("client", new Client());
		model.addAttribute("listClients", this.clientService.listClients());
		return "client";
	}
	@RequestMapping(value = "/admin1", method = RequestMethod.GET)
	public String admin1(Model model) {
		return "admin/index";
	}
	
	@RequestMapping(value = "/h", method = RequestMethod.GET)
	public String h(Model model) {
		return "five-star-hotel/index";
	}
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin2(Model model) {
		return "startbootstrap-sb-admin-1.0.1/index";
	}
	
	@RequestMapping(value = "/inscrire", method = RequestMethod.GET)
	public String inscrire(Model model) {
		model.addAttribute("client", new Client());
		return "inscrire";
	}
	@RequestMapping(value = "/t1", method = RequestMethod.GET)
	public String theme1(Model model) {
		return "theme";
	}
	
	//For add and update client both
	@RequestMapping(value= "/client/add", method = RequestMethod.POST)
	public String addClient(@ModelAttribute("client") Client p){
		
	if(p.getIdClient() == BigInteger.ZERO){
		//new client, add it
			this.clientService.addClient(p);
	}else{
//			//existing client, call update
			this.clientService.updateClient(p);
		}
//		
		return "redirect:/clients";
//		
	}
	
	@RequestMapping("client/{id}/remove")
    public String removeClient(@PathVariable("id") int id){
		
        this.clientService.removeClient(id);
        return "redirect:/clients";
    }
 
    @RequestMapping("client/{id}/edit")
    public String editClient(@PathVariable("id") int id, Model model){
        model.addAttribute("client", this.clientService.getClientById(id));
        model.addAttribute("listClients", this.clientService.listClients());
        return "client";
    }
	
}
