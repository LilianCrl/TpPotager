package fr.lihalie.TpPotager.ihm;

import fr.lihalie.TpPotager.bo.Plante;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanteForm {
	
	private Plante plante;

}
