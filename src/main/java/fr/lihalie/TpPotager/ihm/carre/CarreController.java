package fr.lihalie.TpPotager.ihm.carre;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.lihalie.TpPotager.bll.carre.CarreManager;
import fr.lihalie.TpPotager.bll.potager.PotagerManager;
import fr.lihalie.TpPotager.bo.Carre;
import fr.lihalie.TpPotager.bo.Potager;


@Controller
public class CarreController {
	
	@Autowired
	CarreManager managerCarre;
	
	@Autowired
	PotagerManager managerPotager;
	
	@GetMapping("/ihm/carre")
	public String getCarreForm(CarreForm carreForm, Model model) {
		model.addAttribute("message","Entrez votre carre");
		model.addAttribute("potagers", managerPotager.getAllPotager());
		
		return "/carre/indexCarre";
	}
	
	
	 @PostMapping("/ihm/addCarre")
	 public String addCarre(@Valid CarreForm carreForm, BindingResult errors, Model model, Potager potager) {
		Carre carre = carreForm.getCarre();
			carre.setPotager(potager);
			managerCarre.addCarre(carre);
			model.addAttribute("message","Ajout successful !");			 
		 return "/carre/indexCarre";
	 }
	 

}
