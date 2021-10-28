package fr.lihalie.TpPotager.ihm;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.lihalie.TpPotager.bll.plante.PlanteManager;
import fr.lihalie.TpPotager.bo.Plante;

@Controller
public class PlanteController {
	
	@Autowired
	PlanteManager manager;
	
	
	@GetMapping("/ihm/plante")
	public String indexPlante(PlanteForm planteForm, Model model) {
		model.addAttribute("message","Entrez votre variete de plante");
		return "indexPlante";
	}
	
	
	 @PostMapping("/add")
	 public String add(@Valid PlanteForm planteForm, BindingResult errors, Model model) {
		 Plante nouv = planteForm.getPlante();
			 manager.addPlante(nouv);
			 model.addAttribute("message","Ajout successful !!");			 
		 return "indexPlante";
	 }
	

}
