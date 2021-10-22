package fr.lihalie.TpPotager.bo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Action {

	@Id
	@GeneratedValue
	private Integer idAction;
	private LocalDate dtAction;
	private String evenement;

	@ManyToOne
	private Carre carre;

	@ManyToOne
	private Potager potager;

	public Action(LocalDate dtAction, String evenement, Carre carre, Potager potager) {
		super();
		this.dtAction = dtAction;
		this.evenement = evenement;
		this.carre = carre;
		this.potager = potager;
	}

}
