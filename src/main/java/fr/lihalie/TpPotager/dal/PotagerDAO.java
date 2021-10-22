package fr.lihalie.TpPotager.dal;

import org.springframework.data.repository.CrudRepository;
import fr.lihalie.TpPotager.bo.Potager;

public interface PotagerDAO extends CrudRepository<Potager, Integer> {

}
