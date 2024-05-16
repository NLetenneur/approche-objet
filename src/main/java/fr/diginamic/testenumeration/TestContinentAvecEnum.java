package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		//Créez une liste de villes avec tous les paramètres attendus dont le continent 
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("New York", 8800000, Continent.AMERIQUE));
		villes.add(new Ville("Paris", 2000000, Continent.EUROPE ));
		villes.add(new Ville("Pekin", 21500000, Continent.ASIE));
		villes.add(new Ville("Moscou", 13100000, Continent.ASIE));
		villes.add(new Ville("Berlin", 3600000, Continent.EUROPE));
		villes.add(new Ville("Sydney", 5300000, Continent.OCEANIE));
		villes.add(new Ville("São Paulo", 12000000, Continent.AMERIQUE));
		villes.add(new Ville("Dakar", 10300000, Continent.AFRIQUE));		
		
		//Réalisez une boucle qui affiche l’ensemble des villes avec leur continent	respectif
		for (Ville ville: villes) {
			System.out.println(ville.getNom()+" : "+ville.getContinent().getLibelle());
		}
		
	}

}
