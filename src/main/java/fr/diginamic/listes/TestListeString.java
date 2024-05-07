package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		//Création de la liste
		ArrayList<String> villes = new ArrayList<>();
		Collections.addAll(villes, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
		
		//Recherche de la ville qui a le plus grand nombre de lettres
		String longueVille ="";
		int longueur = 0;
		for (int i =0; i<villes.size(); i++) {
			String villeCourante = villes.get(i);
			if (villeCourante.length()>longueur) {
				longueVille = villeCourante;
				longueur = villeCourante.length();				
			}
		}
		System.out.println(longueVille);
		
		//Mettre tous les noms de ville en majuscule
		for (int i =0; i<villes.size(); i++) {
			villes.set(i, villes.get(i).toUpperCase());
		}
		System.out.println(villes);
		
		//Supprimer les villes dont le nom commence par N et afficher la nouvelle liste
		Iterator<String> iterator = villes.iterator();
		while (iterator.hasNext()) {
			String ville = iterator.next();
			if (ville.charAt(0) =='N') {
				iterator.remove();
			}
		}
		System.out.println(villes);
	}

}
