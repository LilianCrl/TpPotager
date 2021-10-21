package fr.lihalie.TpPotager.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Potager {
	
	
	@Id
	@GeneratedValue
	private Integer idPotager;
	private String localisation;
	private String nomPotager;
	private Double surface;
	private String ville;
	
	public Potager(String localisation, String nomPotager, Double surface, String ville) {
		super();
		this.localisation = localisation;
		this.nomPotager = nomPotager;
		this.surface = surface;
		this.ville = ville;
	}
	
	
	
}
