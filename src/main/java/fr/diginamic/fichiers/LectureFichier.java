package fr.diginamic.fichiers;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		ArrayList<Ville> listeVilles = new ArrayList<Ville>();
		Path recensement = Paths.get(
				"C:\\Users\\nlete\\git\\approche-objet\\src\\main\\java\\fr\\diginamic\\fichiers\\recensement.csv");
		boolean exists = Files.exists(recensement);
		List<String> linesSup25k = new ArrayList<>();
		if (exists) {
			List<String> lines = Files.readAllLines(recensement, StandardCharsets.UTF_8);
			System.out.println(lines);
			Iterator<String> iterator = lines.iterator();
			while (iterator.hasNext()) {
				String ligneCourante = iterator.next();
				String[] tab = ligneCourante.split(";");
				String nbHabS = tab[9];
				nbHabS = nbHabS.trim().replaceAll(" ", "");
				if (nbHabS.chars().allMatch(Character::isDigit)) {
					int nbHab = Integer.parseInt(nbHabS);
					Ville villeCourante = new Ville(tab[6], tab[2], tab[1], nbHab);
					listeVilles.add(villeCourante);
					if (nbHab > 25000) {
						linesSup25k.add(tab[6] + ";" + tab[2] + ";" + tab[1] + ";" + tab[9]);
					}
				}

			}
		}
		Path pathCible = Paths.get(
				"C:\\Users\\nlete\\git\\approche-objet\\src\\main\\java\\fr\\diginamic\\fichiers\\recensementSup25k.csv");
		Files.write(pathCible, linesSup25k);

	}

}
