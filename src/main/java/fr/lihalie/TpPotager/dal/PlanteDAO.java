package fr.lihalie.TpPotager.dal;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.lihalie.TpPotager.bo.Plante;

public interface PlanteDAO extends CrudRepository<Plante, Integer> {
	
	@Query("FROM Plante p WHERE p.typePlante = :type")
	List<Plante> getAllPlanteByType(@Param("type")String type);
	
	@Query("FROM Plante p WHERE p.nomPlante = :nom")
	List<Plante> getAllPlanteByName(@Param("nom")String nom);
	
	@Query("FROM Plante p WHERE p.variete = :variete")
	List<Plante> getAllPlanteByVariete(@Param("variete")String variete );
	

}
