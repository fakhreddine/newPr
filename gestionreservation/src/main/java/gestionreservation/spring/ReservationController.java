package gestionreservation.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gestionreservation.spring.model.Reservation;
import gestionreservation.spring.service.ReservationService;

@Controller
public class ReservationController {
	
	private ReservationService reservationService;
	
	@Autowired(required=true)
	@Qualifier(value="reservationService")
	public void setReservationService(ReservationService ps){
		this.reservationService = ps;
	}
	
	
	
	
	
	@RequestMapping(value = "/reservations", method = RequestMethod.GET)
	public String listReservations(Model model) {
		model.addAttribute("reservation", new Reservation());
		model.addAttribute("listReservations", this.reservationService.listReservations());
		return "reservation";
	}
	
	//For add and update reservation both
	@RequestMapping(value= "/reservation/add", method = RequestMethod.POST)
	public String addReservation(@ModelAttribute("reservation") Reservation p){
		
		if(p.getIdReservation() == "0"){
			//new reservation, add it
			this.reservationService.addReservation(p);
		}else{
			//existing reservation, call update
			this.reservationService.updateReservation(p);
		}
		
		return "redirect:/reservations";
		
	}
	
	@RequestMapping("/reservation/{id}/remove")
    public String removeReservation(@PathVariable("id") int id){
		
        this.reservationService.removeReservation(id);
        return "redirect:/reservations";
    }
 
    @RequestMapping("/reservation/{id}/edit")
    public String editReservation(@PathVariable("id") int id, Model model){
        model.addAttribute("reservation", this.reservationService.getReservationById(id));
        model.addAttribute("listReservations", this.reservationService.listReservations());
        return "reservation";
    }
	
}

