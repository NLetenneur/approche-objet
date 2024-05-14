package fr.diginamic.maps;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import fr.diginamic.tri.Ville;

public class MapVilles {

	public static void main(String[] args) throws IOException {
		// Créez une map permettant de stocker les instances de villes (valeur) en
		// fonction de leur nom (clé)
		HashMap<Integer, Ville> mapVilles = new HashMap<>();

		// Récupération des 100 premières villes du fichier
		List<Ville> listeVilles = new ArrayList<Ville>();
		Path recensement = Paths.get(
				"C:\\Users\\nlete\\git\\approche-objet\\src\\main\\java\\fr\\diginamic\\fichiers\\recensement.csv");
		boolean exists = Files.exists(recensement);
		if (exists) {
			List<String> lines = Files.readAllLines(recensement, StandardCharsets.UTF_8);
			for (int i = 1; i < 101; i++) {
				String ligneCourante = lines.get(i);
				String[] tab = ligneCourante.split(";");
				String nbHabS = tab[9];
				nbHabS = nbHabS.trim().replaceAll(" ", "");
				int nbHab = Integer.parseInt(nbHabS);
				mapVilles.put(i, new Ville(tab[6], tab[2], tab[1], nbHab));
			}
		}

		// Recherchez, affichez et supprimez la ville qui a le moins d’habitants
		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		Iterator<Ville> valuesIte = mapVilles.values().iterator();
		int minHab = 2000000000;
		int keyMin = 0;
		while (valuesIte.hasNext() && keysIte.hasNext()) {
			Ville villeCourante = valuesIte.next();
			if (villeCourante.getPopTotale() < minHab) {
				minHab = villeCourante.getPopTotale();
				keyMin = keysIte.next();
			}
		}
		System.out.println("Index de la ville la moins peuplée : " + keyMin + " " + mapVilles.get(keyMin));
		mapVilles.remove(keyMin);
		
		//Affichez l’ensemble des villes restantes.
		keysIte = mapVilles.keySet().iterator();
		valuesIte = mapVilles.values().iterator();
		while(valuesIte.hasNext()&&keysIte.hasNext()) {
			System.out.println(keysIte.next()+" : "+valuesIte.next());
		}
	}

}
