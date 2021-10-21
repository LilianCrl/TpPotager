package fr.lihalie.TpPotager.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Carre {
	
	@Id
	@GeneratedValue
	private Integer idCarre;
	private String typeDeSol;
	private String typeExposition;
	private Double surface;
	private Potager nomPotager;
	
	public Carre(String typeDeSol, String typeExposition, Double surface, Potager nomPotager) {
		super();
		this.typeDeSol = typeDeSol;
		this.typeExposition = typeExposition;
		this.surface = surface;
		this.nomPotager = nomPotager;
	}
	

}
