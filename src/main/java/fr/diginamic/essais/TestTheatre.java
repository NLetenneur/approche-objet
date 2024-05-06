package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre salleMoliere = new Theatre ("Salle Molière", 50, 20, 300);
		
		salleMoliere.inscrire(10, 20);
		
		salleMoliere.inscrire(15, 25);
				
		salleMoliere.inscrire(10, 30);
		System.out.println(salleMoliere.getNbClients());
		System.out.println(salleMoliere.getRevenue());
		
		
		// TODO Auto-generated method stub

	}

}
