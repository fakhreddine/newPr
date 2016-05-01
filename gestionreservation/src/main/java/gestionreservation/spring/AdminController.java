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
import gestionreservation.spring.model.Admin;
import gestionreservation.spring.service.AdminService;

@Controller
public class AdminController {
	
	private AdminService adminService;
	
	@Autowired(required=true)
	@Qualifier(value="adminService")
	public void setAdminService(AdminService ps){
		this.adminService = ps;
	}
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(Model model) {
		return "admin";
	}
	@RequestMapping(value = "/admins", method = RequestMethod.GET)
	public String listAdmins(Model model) {
		model.addAttribute("admin", new Admin());
		model.addAttribute("listAdmins", this.adminService.listAdmins());
		return "admin";
	}
	
	//For add and update person both
	@RequestMapping(value= "/admin/add", method = RequestMethod.POST)
	
	public String addAdmin(@ModelAttribute("admin") Admin p) {
	//public String addAdmin(@ModelAttribute("admin") Admin p){
		
		if(p.getIdAdmin()==BigInteger.ZERO){
			//new person, add it
			this.adminService.addAdmin(p);
		}else{
			//existing person, call update
			this.adminService.updateAdmin(p);
		}
		
		return "redirect:/admins";
		
	}
	
	@RequestMapping("/admin/{idAdmin}/remove")
    public String removeAdmin(@PathVariable("idAdmin") int id){
		
        this.adminService.removeAdmin(id);
        return "redirect:/admins";
    }
 
    @RequestMapping("/admin/{idAdmin}/edit")
    public String editAdmin(@PathVariable("idAdmin") int id, Model model){
        model.addAttribute("admin", this.adminService.getAdminById(id));
        model.addAttribute("listAdmins", this.adminService.listAdmins());
        return "admin";
    }
	
}
