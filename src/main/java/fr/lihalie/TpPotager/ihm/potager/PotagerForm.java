package fr.lihalie.TpPotager.ihm.potager;

import fr.lihalie.TpPotager.bo.Potager;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PotagerForm {
	private Potager potager;

}
