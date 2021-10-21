package fr.lihalie.TpPotager.bo;
import java.time.LocalDate;

public class PlanteDansCarre extends Plante {
	private Integer nbPlan;
	private LocalDate dtMisePlace;
	private LocalDate dtRecolte;
	
	public PlanteDansCarre(String nomPlante, String typePlante, String variete, Double surfaceOccupee, Integer nbPlan,
			LocalDate dtMisePlace, LocalDate dtRecolte) {
		super(nomPlante, typePlante, variete, surfaceOccupee);
		this.nbPlan = nbPlan;
		this.dtMisePlace = dtMisePlace;
		this.dtRecolte = dtRecolte;
	}
	
	
	

}
