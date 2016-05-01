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
import gestionreservation.spring.model.Agent;
import gestionreservation.spring.service.AgentService;

@Controller
public class AgentController {
	
	private AgentService agentService;
	
	@Autowired(required=true)
	@Qualifier(value="agentService")
	public void setAgentService(AgentService ps){
		this.agentService = ps;
	}
	
	@RequestMapping(value = "/agents", method = RequestMethod.GET)
	public String listAgents(Model model) {
		model.addAttribute("agent", new Agent());
		model.addAttribute("listAgents", this.agentService.listAgents());
		return "agent";
	}
	
	//For add and update person both
	@RequestMapping(value= "/agent/add", method = RequestMethod.POST)
	
	public String addAgent(@ModelAttribute("agent") Agent p) {
	//public String addAgent(@ModelAttribute("agent") Agent p){
		
		if(p.getIdAgent()==BigInteger.ZERO){
			//new person, add it
			this.agentService.addAgent(p);
		}else{
			//existing person, call update
			this.agentService.updateAgent(p);
		}
		
		return "redirect:/agents";
		
	}
	
	@RequestMapping("/agent/{idAgent}/remove")
    public String removeAgent(@PathVariable("idAgent") int id){
		
        this.agentService.removeAgent(id);
        return "redirect:/agents";
    }
 
    @RequestMapping("/agent/{idAgent}/edit")
    public String editAgent(@PathVariable("idAgent") int id, Model model){
        model.addAttribute("agent", this.agentService.getAgentById(id));
        model.addAttribute("listAgents", this.agentService.listAgents());
        return "agent";
    }
	
}
