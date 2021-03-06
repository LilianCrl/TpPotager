package fr.lihalie.TpPotager.bll.plante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lihalie.TpPotager.bo.Plante;
import fr.lihalie.TpPotager.dal.PlanteDAO;

@Service
public class PlanteManagerImpl implements PlanteManager {

	@Autowired
	PlanteDAO dao;

	@Override
	public void addPlante(Plante plante) {
		dao.save(plante);
	}

	@Override
	public List<Plante> getAllPlantes() {
		return (List<Plante>) dao.findAll();
	}

	@Override
	public void updatePlante(Plante plante) {
		dao.save(plante);
	}

	@Override
	public void deletePlante(Plante plante) {
		dao.delete(plante);
	}

}
