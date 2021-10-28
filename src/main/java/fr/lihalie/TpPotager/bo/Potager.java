package fr.lihalie.TpPotager.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"lstCarres", "lstActions"})
@JsonIdentityInfo(
generator = ObjectIdGenerators.PropertyGenerator.class,
property = "idPotager")
public class Potager {

	@Id
	@GeneratedValue
	private Integer idPotager;
	private String localisation;
	private String nomPotager;
	private Double surface;
	private String ville;
	
	
	@OneToMany(mappedBy = "potager")
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonBackReference
	private List<Carre> lstCarres = new ArrayList<>();

	@OneToMany(mappedBy = "potager")
//	@JsonBackReference
	private List<Action> lstActions = new ArrayList<>();

	public Potager(String localisation, String nomPotager, Double surface, String ville) {
		this.localisation = localisation;
		this.nomPotager = nomPotager;
		this.surface = surface;
		this.ville = ville;
	}

}
