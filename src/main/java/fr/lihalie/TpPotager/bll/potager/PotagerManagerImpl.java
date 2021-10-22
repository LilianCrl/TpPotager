package fr.lihalie.TpPotager.bll.potager;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lihalie.TpPotager.bo.Potager;
import fr.lihalie.TpPotager.dal.PotagerDAO;

@Service
public class PotagerManagerImpl implements PotagerManager {

	@Autowired
	PotagerDAO dao;

	@Override
	@Transactional
	public void addPotager(Potager potager) {
		dao.save(potager);
	}

	@Override
	public List<Potager> getAllPotager() {
		return (List<Potager>) dao.findAll();
	}

	@Override
	@Transactional
	public void updatePotager(Potager potager) {
		dao.save(potager);
	}

	@Override
	public void deletePotager(Potager potager) {
		dao.delete(potager);
	}

}
