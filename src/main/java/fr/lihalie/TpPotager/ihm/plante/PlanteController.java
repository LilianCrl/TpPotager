package fr.lihalie.TpPotager.ihm.plante;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.lihalie.TpPotager.bll.plante.PlanteManager;
import fr.lihalie.TpPotager.bo.Plante;

@Controller
public class PlanteController {
	
	@Autowired
	PlanteManager manager;
	
	
	@GetMapping("/ihm/plante")
	public String indexPlante(PlanteForm planteForm, Model model) {
		model.addAttribute("message","Entrez votre variete de plante");
		return "/plante/indexPlante";
	}
	
	
	 @PostMapping("/add")
	 public String add(@Valid PlanteForm planteForm, BindingResult errors, Model model) {
		 Plante nouv = planteForm.getPlante();
			 manager.addPlante(nouv);
			 model.addAttribute("message","Ajout successful !!");			 
		 return "/plante/indexPlante";
	 }
	 
		// Display all  Plantes Method 1 : Using the Model Spring dependency
		@GetMapping("/ihm/lstplante")
		public String listPlantes( Model model) {
			model.addAttribute("lstPlantes", manager.getAllPlantes());
			return "/plante/indexLstplante";

	}
		

	 // Display all  Plantes Method 2 : using the ModelAndView spring dependency
		@GetMapping("/rootPlantes")
		public ModelAndView getAllPlantes(Model model) {
			
			ModelAndView mav = new ModelAndView("/plante/lstPlanteMethod2");
			List<Plante> lstPlantes = new ArrayList<Plante>();
			lstPlantes = manager.getAllPlantes();
			mav.addObject("rootPlantes", lstPlantes);
			return mav;
	}
		

	
}
