package fr.lihalie.TpPotager.bll.potager;

import java.util.List;

import fr.lihalie.TpPotager.bo.Potager;

public interface PotagerManager   {
	public void addPotager(Potager potager);

	public List<Potager> getAllPotager();

	public void updatePotager(Potager potager);

	public void deletePotager(Potager potager);
}
