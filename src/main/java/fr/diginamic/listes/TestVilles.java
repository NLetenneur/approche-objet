package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVilles {

	public static void main(String[] args) {
		// Création de la liste de villes
		Ville v01 = new Ville("Nice", 343000);
		Ville v02 = new Ville("Carcassone", 47800);
		Ville v03 = new Ville("Narbonne", 53400);
		Ville v04 = new Ville("Lyon", 484000);
		Ville v05 = new Ville("Foix", 9700);
		Ville v06 = new Ville("Pau", 77200);
		Ville v07 = new Ville("Marseille", 850700);
		Ville v08 = new Ville("Tarbes", 40600);

		ArrayList<Ville> villes = new ArrayList<>();
		Collections.addAll(villes, v01, v02, v03, v04, v05, v06, v07, v08);
		System.out.println(villes);

		// Recherche et affichage de la ville la plus peuplée
		Ville villeMax = new Ville("", 0);
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).nbHabitants > villeMax.nbHabitants) {
				villeMax = villes.get(i);
			}
		}
		System.out.println(villeMax);
		
		//Suppression de la ville la moins peuplée
		Ville villeMin = new Ville("", 1000000000);
		int villeMinPos = 0;
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).nbHabitants < villeMin.nbHabitants) {
				villeMin = villes.get(i);
				villeMinPos=i;
			}
		}
		System.out.println(villeMin);
		villes.remove(villeMinPos);
		
		//Mettre en majuscules le nom des villes de plus de 100 000 habitants
		for (int i =0; i<villes.size(); i++) {
			Ville ville = villes.get(i);
			if (ville.nbHabitants>100000) {
				ville.nom = ville.nom.toUpperCase();
				villes.set(i, ville);
			}
		}
		
		//Afficher le résultat
		System.out.println(villes);
	}

}
