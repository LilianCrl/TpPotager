package fr.lihalie.TpPotager.bll.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lihalie.TpPotager.bo.Action;
import fr.lihalie.TpPotager.dal.ActionDAO;

@Service
public class ActionManagerImpl implements ActionManager {

	@Autowired
	ActionDAO dao;

	@Override
	public void addAction(Action action) {
		dao.save(action);
	}

	@Override
	public List<Action> getAllAction() {
		return (List<Action>) dao.findAll();
	}

	@Override
	public void updateAction(Action action) {
		dao.save(action);
	}

	@Override
	public void deleteAction(Action action) {
		dao.delete(action);
	}

}
