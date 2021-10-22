package fr.lihalie.TpPotager;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.lihalie.TpPotager.bll.action.ActionManager;
import fr.lihalie.TpPotager.bll.carre.CarreManager;
import fr.lihalie.TpPotager.bll.plante.PlanteManager;
import fr.lihalie.TpPotager.bll.potager.PotagerManager;
import fr.lihalie.TpPotager.bo.Action;
import fr.lihalie.TpPotager.bo.Carre;
import fr.lihalie.TpPotager.bo.Plante;
import fr.lihalie.TpPotager.bo.Potager;

@SpringBootApplication
public class TpPotagerApplication implements CommandLineRunner  {
	
	@Autowired
	PotagerManager managerPotager;
	
	@Autowired
	CarreManager managerCarre;
	
	@Autowired
	PlanteManager managerPlante;
	
	@Autowired
	ActionManager managerAction;
	
	
	

	
	public static void main(String[] args) {
		SpringApplication.run(TpPotagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Test insertion potager
		
		Potager ptg1 = new Potager("Eni", "Les DevPotagers", 30., "Quimper");
		Potager ptg2 = new Potager("Hent", "Les Begard Potagers", 40., "Begard");
		managerPotager.addPotager(ptg1 );
		managerPotager.addPotager(ptg2 );
		
		managerPotager.getAllPotager().forEach(System.out::println);
		
		
		//Test insertion Carre
		
		Carre c1 = new Carre("Sable", "Sud", 5., ptg2);
		Carre c2 = new Carre("Sable", "Sud", 5., ptg1);
		
		managerCarre.addCarre(c2);
		managerCarre.addCarre(c1);
		
		managerCarre.getAllCarres().forEach(System.out::println);
		
		//Test insertion Plante
		
		Plante pl1 = new Plante("Epinard", "Potagere", "France", 1.);
		Plante pl2 = new Plante("Pack", "Potagere", "chine", 1.);
		managerPlante.addPlante(pl1);
		managerPlante.addPlante(pl2);
		
		managerPlante.getAllPlantes().forEach(System.out::println);
		
		
		//Test insertion Action
		Action A1 = new Action(LocalDate.now().plusDays(2), "cleaning", c1, ptg1);
		managerAction.addAction(A1);
		managerAction.getAllAction().forEach(System.out::println);
		
		
		
	}


}
