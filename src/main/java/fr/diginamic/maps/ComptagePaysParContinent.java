package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// Créez une ArrayList de Pays contenant les pays suivants
		Pays france = new Pays("France", 65000000, "Europe");
		Pays allemagne = new Pays("Allemagne", 80000000, "Europe");
		Pays belgique = new Pays("Belgique", 10000000, "Europe");
		Pays russie = new Pays("Russie", 150000000, "Asie");
		Pays chine = new Pays("Chine", 1400000000, "Asie");
		Pays indonesie = new Pays("Indonésie", 220000000, "Asie");
		Pays australie = new Pays("Australie", 20000000, "Océanie");
		Pays aotearoa = new Pays("Nouvelle-Zélande", 5000000, "Océanie");
		Pays fidji = new Pays("République des Fidji", 900000, "Océanie");
		ArrayList<Pays> listePays = new ArrayList<>();
		Collections.addAll(listePays, france, allemagne, belgique, russie, chine, indonesie, australie, aotearoa,
				fidji);

		// Utilisez une HashMap pour réaliser un comptage du nombre de pays par
		// continent
		HashMap<String, Integer> mapContinent = new HashMap<>();
		for (Pays pays : listePays) {
			if (mapContinent.get(pays.Continent) != null) {
				int nb = mapContinent.get(pays.Continent) + 1;
				mapContinent.put(pays.Continent, nb);
			} else {
				mapContinent.put(pays.Continent, 1);
			}
		}
		Iterator<String> keysIte = mapContinent.keySet().iterator();
		while (keysIte.hasNext()) {
			String paysC = keysIte.next();
			System.out.println(paysC + " : " + mapContinent.get(paysC));
		}

	}

}
