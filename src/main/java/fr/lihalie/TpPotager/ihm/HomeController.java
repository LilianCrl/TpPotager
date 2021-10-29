package fr.lihalie.TpPotager.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/ihm/Home")
	public String index(Model model) {
		model.addAttribute("message", "Bienvenue sur le gestionnaire de potager de Lihalie !");
		return "/index";
	}

}
