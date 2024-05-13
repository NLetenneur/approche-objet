package fr.diginamic.fichiers;

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
		if (exists) {
			List<String> lines = Files.readAllLines(recensement, StandardCharsets.UTF_8);
			System.out.println(lines);
			Iterator<String> iterator = lines.iterator();
			while (iterator.hasNext()) {
				String ligneCourante = iterator.next();
				String[] tab = ligneCourante.split(";");
			if (tab[9].chars().allMatch( Character::isDigit )) {
					Ville villeCourante = new Ville(tab[6],tab[2],tab[1],Integer.parseInt(tab[9]));
					listeVilles.add(villeCourante);
				}
								
			}
		}
		
		
	}

}
