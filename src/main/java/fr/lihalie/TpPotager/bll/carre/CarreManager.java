package fr.lihalie.TpPotager.bll.carre;

import java.util.List;

import fr.lihalie.TpPotager.bo.Carre;

public interface CarreManager {
	public void addCarre(Carre carre);

	public List<Carre> getAllCarres();

	public void updateCarre(Carre carre);

	public void deleteCarre(Carre carre);
}
