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
public class PlanteDansCarre {
	@Id
	@GeneratedValue
	private Integer idPdc;
	private Integer nbPlan;
	private LocalDate dtMisePlace;
	private LocalDate dtRecolte; 

	@ManyToOne
	private Carre carre;
	
	@ManyToOne
	private Plante plante;

	public PlanteDansCarre(Integer nbPlan, LocalDate dtMisePlace, LocalDate dtRecolte, Carre carre, Plante plante) {
		super();
		this.nbPlan = nbPlan;
		this.dtMisePlace = dtMisePlace;
		this.dtRecolte = dtRecolte;
		this.carre = carre;
		this.plante = plante;
	}
	
	
	

}
