package fr.lihalie.TpPotager.bll.action;

import java.util.List;

import fr.lihalie.TpPotager.bo.Action;

public interface ActionManager {
	public void addAction(Action action);

	public List<Action> getAllAction();

	public void updateAction(Action action);

	public void deleteAction(Action action);
}
