package fr.lihalie.TpPotager.ws;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.lihalie.TpPotager.bll.potager.PotagerManager;
import fr.lihalie.TpPotager.bo.Potager;

@RestController
public class PotagerWS {
	
	@Autowired
	PotagerManager manager;
	
	@GetMapping("/potager")
	public List<Potager> getAll(){
		return manager.getAllPotager();
	}
	
	

}
