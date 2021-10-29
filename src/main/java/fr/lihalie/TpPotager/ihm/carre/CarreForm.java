package fr.lihalie.TpPotager.ihm.carre;

import fr.lihalie.TpPotager.bo.Carre;
import fr.lihalie.TpPotager.bo.Potager;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarreForm {
	
	private Carre carre;
	private Potager potager;

}
