package fr.lihalie.TpPotager.bll.planteDansCarre;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.lihalie.TpPotager.bo.PlanteDansCarre;
import fr.lihalie.TpPotager.dal.PlanteDansCarreDAO;

@Service
public class PlanteDansCarreImpl implements PlanteDansCarreManager {
	@Autowired
	PlanteDansCarreDAO dao;

	@Override
	@Transactional
	public void addPdc(PlanteDansCarre pdc) {
		dao.save(pdc);
		
	}

	@Override
	public List<PlanteDansCarre> getAllPdc() {
		return (List<PlanteDansCarre>) dao.findAll();
	}

	@Override
	@Transactional
	public void updatePlante(PlanteDansCarre pdc) {
		dao.save(pdc);
		
	}

	@Override
	public void deletePlante(PlanteDansCarre pdc) {
		dao.delete(pdc);
		
	}

	

}
