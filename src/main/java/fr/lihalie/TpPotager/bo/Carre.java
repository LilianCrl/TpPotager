package fr.lihalie.TpPotager.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	
	@ManyToOne
	private Potager potager;
	
	@OneToMany(mappedBy = "carre")
	private List<PlanteDansCarre> lstPdc = new ArrayList<>();

	public Carre(String typeDeSol, String typeExposition, Double surface, Potager potager) {
		super();
		this.typeDeSol = typeDeSol;
		this.typeExposition = typeExposition;
		this.surface = surface;
		this.potager = potager;
	}

	

	
	
	
	
	
	
	
	

}
