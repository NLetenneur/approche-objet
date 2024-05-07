package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		// Creation de la liste
		List<Integer> listeEntiers = new ArrayList<>();
		Collections.addAll(listeEntiers, -1, 5, 7, 3, -2, 4, 8, 5);

		// Affichage de la liste
		System.out.println(listeEntiers);

		// Affichage de la taille de la liste
		System.out.println(listeEntiers.size());

		// Recherche et affichage du nombre le plus grand de la liste
		Iterator<Integer> iterator = listeEntiers.iterator();
		int nbMax = 0;
		while (iterator.hasNext()) {
			int nbCourant = iterator.next();
			if (nbCourant > nbMax) {
				nbMax = nbCourant;
			}
		}
		System.out.println(nbMax);

		// Suppression du nombre le plus petit de la liste et affichage du résultat
		int nbMin = 0;
		int nbMinPos =15;
		for (int i=0; i<listeEntiers.size(); i++) {
			int nbCourant = listeEntiers.get(i);
			if (nbMin>nbCourant) {
				nbMin = nbCourant;
				nbMinPos = i;
			}
		}
		listeEntiers.remove(nbMinPos);
		System.out.println(listeEntiers);
		System.out.println(nbMin);

	}

}
