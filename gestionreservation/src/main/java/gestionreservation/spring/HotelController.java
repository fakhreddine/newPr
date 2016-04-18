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

import gestionreservation.spring.model.Hotel;
import gestionreservation.spring.model.Hotel;
import gestionreservation.spring.service.HotelService;

@Controller
public class HotelController {
	
	private HotelService hotelService;
	
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
		
		if(p.getIdHotel() == 0){
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
	
}
