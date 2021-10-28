package fr.lihalie.TpPotager.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.lihalie.TpPotager.bll.potager.PotagerManager;
import fr.lihalie.TpPotager.bo.Potager;

@RestController
public class PotagerWS {
	
	@Autowired
	PotagerManager manager;
	
	@GetMapping("/ws/potager")
	public List<Potager> getAll(){
		return manager.getAllPotager();
	}
	
	@GetMapping("/ws/potager/{id}")
	public Potager getById(@PathVariable Integer id){
		return manager.getPotagerById(id);
	}
	
	
	
	@PostMapping("/ws/potager")
	public Potager createPotager(@RequestBody Potager potager) {
		manager.addPotager(potager);
		return potager;
	}
	
//	@DeleteMapping("ws/potager/delete/{id}")
//	public void deletePotager(@PathVariable Integer id) {
//		Potager p = manager.getPotagerById(id);
//		manager.deletePotager(p);
//		
//	}
//	public void delete(@PathVariable("id") Integer id){
//		manager.deletePotager(manager.getPotagerById(id));
//		}
//	
	
//	@PutMapping("ws/potager/update/{id}")
//	public Potager update(@RequestBody Potager potager, @PathVariable Integer id) {
//		Potager p = manager.getPotagerById(id);
//		
//		p.setLocalisation(potager.getLocalisation());
//		p.setNomPotager(potager.getNomPotager());
//		p.setSurface(potager.getSurface());
//		p.setVille(potager.getVille());
//		
//		manager.updatePotager(potager);
//		return potager;
//		
//	}

}
