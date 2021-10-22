package fr.lihalie.TpPotager.bll.planteDansCarre;

import java.util.List;
import fr.lihalie.TpPotager.bo.PlanteDansCarre;

public interface PlanteDansCarreManager {
	public void addPdc(PlanteDansCarre pdc);

	public List<PlanteDansCarre> getAllPdc();

	public void updatePlante(PlanteDansCarre pdc);

	public void deletePlante(PlanteDansCarre pdc);

}
