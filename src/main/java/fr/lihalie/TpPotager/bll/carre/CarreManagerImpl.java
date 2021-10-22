package fr.lihalie.TpPotager.bll.carre;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lihalie.TpPotager.bo.Carre;
import fr.lihalie.TpPotager.dal.CarreDAO;

@Service
public class CarreManagerImpl implements CarreManager {

	@Autowired
	CarreDAO dao;

	@Override
	@Transactional
	public void addCarre(Carre carre) {
		dao.save(carre);
	}

	@Override
	public List<Carre> getAllCarres() {
		return (List<Carre>) dao.findAll();
	}

	@Override
	@Transactional
	public void updateCarre(Carre carre) {
		dao.save(carre);
	}

	@Override
	public void deleteCarre(Carre carre) {
		dao.delete(carre);
	}

}
