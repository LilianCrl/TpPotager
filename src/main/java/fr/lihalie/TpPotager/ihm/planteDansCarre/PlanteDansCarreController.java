package fr.lihalie.TpPotager.ihm.planteDansCarre;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.lihalie.TpPotager.bll.carre.CarreManager;
import fr.lihalie.TpPotager.bll.plante.PlanteManager;
import fr.lihalie.TpPotager.bll.planteDansCarre.PlanteDansCarreManager;
import fr.lihalie.TpPotager.bo.Carre;
import fr.lihalie.TpPotager.bo.Plante;
import fr.lihalie.TpPotager.bo.PlanteDansCarre;

@Controller
public class PlanteDansCarreController {
	
	@Autowired
	CarreManager managerCarre;
	
	@Autowired
	PlanteDansCarreManager managerPdc;
	
	@Autowired
	PlanteManager managerPlante;
	
	@GetMapping("/ihm/pdc")
	public String indexPdc(PdcForm pdcForm, Model model) {
		model.addAttribute("message","Entrez votre Plante dans un carre");
		model.addAttribute("plantes", managerPlante.getAllPlantes());
		model.addAttribute("carres", managerCarre.getAllCarres() );
		
		return "/planteDansCarre/indexPdc";
	}
	
	
	 @PostMapping("/ihm/addpdc")
	 public String addPlanteDansCarre(@Valid PdcForm pdcForm, BindingResult errors, Model model, Plante plante,Carre carre) {
		PlanteDansCarre pdc = pdcForm.getPdc();
			pdc.setCarre(carre);
			pdc.setPlante(plante);
			managerPdc.addPdc(pdc);
			model.addAttribute("message","Ajout successful !");			 
		 return "/planteDansCarre/indexPdc";
	 }
	 
}
