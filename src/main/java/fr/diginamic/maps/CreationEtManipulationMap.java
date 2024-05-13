package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		//Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		while(keysIte.hasNext()) {
			System.out.println(keysIte.next());
		}
		
		//Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		Iterator<String> valuesIte = mapVilles.values().iterator();
		while(valuesIte.hasNext()) {
			System.out.println(valuesIte.next());
		}
		
		//Afficher la taille de la map
		System.out.println("Il y a "+mapVilles.size()+" entrées dans la map.");
		
	}
	
	

}
