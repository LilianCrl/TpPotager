package fr.lihalie.TpPotager.bo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@JsonIdentityInfo(
generator = ObjectIdGenerators.PropertyGenerator.class,
property = "idAction")
public class Action {

	@Id
	@GeneratedValue
	private Integer idAction;
	private LocalDate dtAction;
	private String evenement;

	@ManyToOne
//	@JsonManagedReference
	private Carre carre;

	@ManyToOne
//	@JsonManagedReference
	private Potager potager;

	public Action(LocalDate dtAction, String evenement, Carre carre, Potager potager) {
		super();
		this.dtAction = dtAction;
		this.evenement = evenement;
		this.carre = carre;
		this.carre.getLstActions().add(this);
		this.potager = potager;
		this.potager.getLstActions().add(this);
	}

}
