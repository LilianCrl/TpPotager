package fr.lihalie.TpPotager.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	
	@OneToMany(mappedBy = "potager")
	private List<Carre> lstCarres = new ArrayList<>();

	public Potager(String localisation, String nomPotager, Double surface, String ville) {
		super();
		this.localisation = localisation;
		this.nomPotager = nomPotager;
		this.surface = surface;
		this.ville = ville;
		
	}
	
	
	
}
