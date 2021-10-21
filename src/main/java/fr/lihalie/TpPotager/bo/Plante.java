package fr.lihalie.TpPotager.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Plante {
	
	@Id
	@GeneratedValue
	private Integer idPlante;
	private String nomPlante;
	private String typePlante;
	private String variete;
	private Double surfaceOccupee;
	
	public Plante(String nomPlante, String typePlante, String variete, Double surfaceOccupee) {
		super();
		this.nomPlante = nomPlante;
		this.typePlante = typePlante;
		this.variete = variete;
		this.surfaceOccupee = surfaceOccupee;
	}
	
	

}
