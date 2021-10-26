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
@ToString(exclude = "lstPdcs")
public class Plante {

	@Id
	@GeneratedValue
	private Integer idPlante;
	private String nomPlante;
	private String typePlante;
	private String variete;
	private Double surfaceOccupee;

	@OneToMany(mappedBy = "plante")
	//@JsonBackReference
	private List<PlanteDansCarre> lstPdcs = new ArrayList<>();

	public Plante(String nomPlante, String typePlante, String variete, Double surfaceOccupee) {
		super();
		this.nomPlante = nomPlante;
		this.typePlante = typePlante;
		this.variete = variete;
		this.surfaceOccupee = surfaceOccupee;
	}

}
