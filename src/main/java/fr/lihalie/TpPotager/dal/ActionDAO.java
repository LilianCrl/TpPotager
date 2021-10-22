package fr.lihalie.TpPotager.dal;

import org.springframework.data.repository.CrudRepository;
import fr.lihalie.TpPotager.bo.Action;

public interface ActionDAO extends CrudRepository<Action, Integer> {

}
