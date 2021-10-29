package fr.lihalie.TpPotager.ihm.action;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.lihalie.TpPotager.bll.action.ActionManager;
import fr.lihalie.TpPotager.bll.carre.CarreManager;
import fr.lihalie.TpPotager.bll.potager.PotagerManager;
import fr.lihalie.TpPotager.bo.Action;
import fr.lihalie.TpPotager.bo.Carre;
import fr.lihalie.TpPotager.bo.Potager;

@Controller
public class ActionController {
	
	@Autowired
	ActionManager managerAction;
	
	@Autowired
	PotagerManager managerPotager;
	
	@Autowired
	CarreManager managerCarre;
	
	
	@GetMapping("/ihm/action")
	public String getActionForm(ActionForm actionForm, Model model, Potager p) {
		model.addAttribute("message", "Entrez votre futur action");
		model.addAttribute("potagers", managerPotager.getAllPotager());
		//TODO : Make AJAX request to autoload potager.getListCarre();
		//For now let just display all available Carre then select a good one
		model.addAttribute("carres", managerCarre.getAllCarres());
		return "/action/indexAction";
	}

	@PostMapping("/ihm/addaction")
	public String addAction(@Valid ActionForm actionForm, Model model, Potager potager, Carre carre) {
		Action action = actionForm.getAction();
		action.setPotager(potager);
		action.setCarre(carre);
//		for (Carre c: potager.getLstCarres()) {
//			if(c.getIdCarre()==carre.getIdCarre()) {
//				action.setCarre(carre);
//			}
//		}
		return "/action/indexAction";
	}
	

}
