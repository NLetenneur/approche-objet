package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		HashMap <String, Integer> creationMap = new HashMap<>();
		creationMap.put("Paul", 1750);
		creationMap.put("Hicham", 1825);
		creationMap.put("Yu", 2250);
		creationMap.put("Ingrid", 2015);
		creationMap.put("Chantal", 2418);
		
		System.out.println("Il y a "+creationMap.size()+" employé/es.");
		

	}

}
