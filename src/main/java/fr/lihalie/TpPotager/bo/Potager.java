package fr.lihalie.TpPotager.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"lstCarres", "lstActions"})
public class Potager {

	@Id
	@GeneratedValue
	private Integer idPotager;
	private String localisation;
	private String nomPotager;
	private Double surface;
	private String ville;
	
	
	@OneToMany(mappedBy = "potager")
	//@JsonBackReference
	private List<Carre> lstCarres = new ArrayList<>();

	@OneToMany(mappedBy = "potager")
	//@JsonBackReference
	private List<Action> lstActions = new ArrayList<>();

	public Potager(String localisation, String nomPotager, Double surface, String ville) {
		super();
		this.localisation = localisation;
		this.nomPotager = nomPotager;
		this.surface = surface;
		this.ville = ville;
	}

}
