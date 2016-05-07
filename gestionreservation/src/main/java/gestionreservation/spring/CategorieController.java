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
import org.springframework.web.bind.annotation.SessionAttributes;

import gestionreservation.spring.model.Categorie;
import gestionreservation.spring.service.CategorieService;
@SessionAttributes
@Controller
public class CategorieController {
	@Autowired
	@Qualifier(value = "utilisateurServiceImpl")
	private UserDetailsService utilisateurService;

	public void setUtilisateurService(UserDetailsService ps) {
		this.utilisateurService = ps;
	}
	
	private CategorieService categorieService;
	
	@Autowired(required=true)
	@Qualifier(value="categorieService")
	public void setCategorieService(CategorieService ps){
		this.categorieService = ps;
	}
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public String listCategories(Model model) {
		
		model.addAttribute("categorie", new Categorie());
		model.addAttribute("listCategories", this.categorieService.listCategories());
		return "categorie";
	}
	
	//For add and update person both
	@RequestMapping(value= "/categorie/add", method = RequestMethod.POST)
	public String addCategorie(@ModelAttribute("categorie") Categorie p ){
		
		if(p.getIdCategorie() == 0){
			//new person, add it
			this.categorieService.addCategorie(p);
		}else{
			//existing person, call update
			this.categorieService.updateCategorie(p);
		}
		return "redirect:/categories";
		
	}
//	
//	//For add and update person both
	@RequestMapping(value= "/categorie/add1", method = RequestMethod.POST)
	public String addCategorie1(@ModelAttribute("categorie") Categorie p){
		
			if(p.getIdCategorie() == 0){
				//new person, add it
				this.categorieService.addCategorie(p);
			}else{
				//existing person, call update
				this.categorieService.updateCategorie(p);
			}
		return "redirect:/categories";
//			
	}
	
	@RequestMapping("/categorie/{idCategorie}/remove")
    public String removeCategorie(@PathVariable("idCategorie") int id){
		
        this.categorieService.removeCategorie(id);
        return "redirect:/categories";
    }
 
    @RequestMapping("/categorie/{idCategorie}/edit")
    public String editCategorie(@PathVariable("id") int id, Model model){
        model.addAttribute("categorie", this.categorieService.getCategorieById(id));
        model.addAttribute("listCategories", this.categorieService.listCategories());
        return "categorie";
    }
	
}
