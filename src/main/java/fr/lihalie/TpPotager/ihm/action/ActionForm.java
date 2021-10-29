package fr.lihalie.TpPotager.ihm.action;

import fr.lihalie.TpPotager.bo.Action;
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
public class ActionForm {
	
	private Action action;
	private Carre carre;
	private Potager potager;

}
