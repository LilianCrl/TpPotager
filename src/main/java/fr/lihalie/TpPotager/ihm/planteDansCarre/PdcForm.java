package fr.lihalie.TpPotager.ihm.planteDansCarre;

import fr.lihalie.TpPotager.bo.Carre;
import fr.lihalie.TpPotager.bo.Plante;
import fr.lihalie.TpPotager.bo.PlanteDansCarre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PdcForm {
	
	private PlanteDansCarre pdc;
	
	private Carre carre;
	
	private Plante plante;
	
	

}
