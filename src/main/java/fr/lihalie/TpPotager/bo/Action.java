package fr.lihalie.TpPotager.bo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	private Carre lieu;
	
	public Action(LocalDate dtAction, String evenement, Carre lieu) {
		super();
		this.dtAction = dtAction;
		this.evenement = evenement;
		this.lieu = lieu;
	}
	
	

	

}
