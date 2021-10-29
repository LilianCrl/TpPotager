package fr.lihalie.TpPotager.dal;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.lihalie.TpPotager.bo.Carre;
import fr.lihalie.TpPotager.bo.Potager;

public interface PotagerDAO extends CrudRepository<Potager, Integer> {
	
	@Query("FROM Potager p WHERE p.idPotager =:idPotager")
	Potager getPotagerById(@Param("idPotager") Integer idPotager);

}
