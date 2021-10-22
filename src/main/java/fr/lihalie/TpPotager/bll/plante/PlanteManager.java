package fr.lihalie.TpPotager.bll.plante;

import java.util.List;

import fr.lihalie.TpPotager.bo.Plante;

public interface PlanteManager {
	public void addPlante(Plante plante);

	public List<Plante> getAllPlantes();

	public void updatePlante(Plante plante);

	public void deletePlante(Plante plante);
}
