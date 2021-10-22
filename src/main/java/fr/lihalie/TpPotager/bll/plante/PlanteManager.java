package fr.lihalie.TpPotager.bll.plante;

import java.util.List;
import org.springframework.stereotype.Service;
import fr.lihalie.TpPotager.bo.Plante;

@Service
public interface PlanteManager {
	public void addPlante(Plante plante);

	public List<Plante> getAllPlantes();

	public void updatePlante(Plante plante);

	public void deletePlante(Plante plante);
	

}
