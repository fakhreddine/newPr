package gestionreservation.spring;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gestionreservation.spring.model.Hotel;
import gestionreservation.spring.model.Role;
import gestionreservation.spring.model.Utilisateur;
import gestionreservation.spring.service.HotelService;
import gestionreservation.spring.service.UtilisateurServiceImpl;

@Controller
public class HotelController {
	@Autowired
	@Qualifier(value = "utilisateurServiceImpl")
	private UserDetailsService utilisateurService;

	public void setUtilisateurService(UserDetailsService ps) {
		this.utilisateurService = ps;
	}
	private HotelService hotelService;
	//private UtilisateurServiceImpl utilisateurService;
	
//	@Autowired
//	@Qualifier(value="utilisateurServiceImpl")
//	public void setUtilisateurService(UtilisateurServiceImpl ps){
//		this.utilisateurService = ps;
//	}
	
	
	@Autowired(required=true)
	@Qualifier(value="hotelService")
	public void setHotelService(HotelService ps){
		this.hotelService = ps;
	}
	
	@RequestMapping(value = "/hotels", method = RequestMethod.GET)
	public String listHotels(Model model) {
		model.addAttribute("hotel", new Hotel());
		model.addAttribute("listHotels", this.hotelService.listHotels());
		return "hotel";
	}
	
	//For add and update person both
	@RequestMapping(value= "/hotel/add", method = RequestMethod.POST)
	
	public String addHotel(@ModelAttribute("hotel") Hotel p) {
	//public String addHotel(@ModelAttribute("hotel") Hotel p){
		
		if(p.getIdHotel() == "0"){
			//new person, add it
			this.hotelService.addHotel(p);
		}else{
			//existing person, call update
			this.hotelService.updateHotel(p);
		}
		
		return "redirect:/hotels";
		
	}
	
	@RequestMapping("/hotel/{idHotel}/remove")
    public String removeHotel(@PathVariable("idHotel") int id){
		
        this.hotelService.removeHotel(id);
        return "redirect:/hotels";
    }
 
    @RequestMapping("/hotel/{idHotel}/edit")
    public String editHotel(@PathVariable("idHotel") int id, Model model){
        model.addAttribute("hotel", this.hotelService.getHotelById(id));
        model.addAttribute("listHotels", this.hotelService.listHotels());
        return "hotel";
    }
    @RequestMapping(value = "/initialise", method = RequestMethod.GET)
	public String initialise(Model model) {
    	Utilisateur user = new Utilisateur();
      user.setPrenomPers("firstName");
      user.setNomPers("lastName");
      user.setLogin("user");
      user.setEmailPers("user");
      user.setMotDePass("1111");
      Role r = new Role();
      r.setDescriptionRole("Admin");
      List<Role> roles = new ArrayList<Role>();
      roles.add(r);
      user.setAuthorities(roles);
    //  this.utilisateurService.addUtilisateur(user);
      return "hotel";
	}
}
