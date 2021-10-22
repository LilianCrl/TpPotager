package fr.lihalie.TpPotager.dal;

import org.springframework.data.repository.CrudRepository;
import fr.lihalie.TpPotager.bo.Plante;

public interface PlanteDAO extends CrudRepository<Plante, Integer> {

}
