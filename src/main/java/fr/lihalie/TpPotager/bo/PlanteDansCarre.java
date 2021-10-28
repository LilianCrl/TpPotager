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
property = "idPdc")
public class PlanteDansCarre {
	@Id
	@GeneratedValue
	private Integer idPdc;
	private Integer nbPlan;
	private LocalDate dtMisePlace;
	private LocalDate dtRecolte; 

	@ManyToOne
//	@JsonManagedReference
	private Carre carre;
	
	@ManyToOne
//	@JsonManagedReference
	private Plante plante;

	public PlanteDansCarre(Integer nbPlan, LocalDate dtMisePlace, LocalDate dtRecolte, Carre carre, Plante plante) {
		super();
		this.nbPlan = nbPlan;
		this.dtMisePlace = dtMisePlace;
		this.dtRecolte = dtRecolte;
		this.carre = carre;
		this.plante = plante;
		this.carre.getLstPdcs().add(this);
		this.plante.getLstPdcs().add(this);
	}
	
	
	

}
