package fr.lihalie.TpPotager.ihm.potager;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.lihalie.TpPotager.bll.potager.PotagerManager;
import fr.lihalie.TpPotager.bo.Potager;

@Controller
public class PotagerController {
	
	@Autowired
	PotagerManager manager;
	
	@GetMapping("/ihm/potager")
	public String indexPotager(PotagerForm potagerForm, Model model) {
		model.addAttribute("message","Entrez votre potager");
		return "/potager/indexPotager";
	}
	
	
	 @PostMapping("/ihm/addPotager")
	 public String add(@Valid PotagerForm potagerForm, BindingResult errors, Model model) {
		Potager potager = potagerForm.getPotager();
			 manager.addPotager(potager);
			 model.addAttribute("message","Ajout successful !!");			 
		 return "/potager/indexPotager";
	 }
	 
		// Display all  Plantes Method 1 : Using the Model Spring dependency
		@GetMapping("/ihm/lstpotager")
		public String listPotager( Model model) {
			model.addAttribute("lstPotager", manager.getAllPotager());
			
			
			return "/potager/indexLstPotager";

	}
	
	
	

}
