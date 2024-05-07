package fr.diginamic.fichiers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		Path home = Paths.get("C:\\Users\\nlete\\git\\approche-objet\\src\\main\\java\\fr\\diginamic\\fichiers");
		Path recensement = home.resolve("./recensement.csv");
				
		List<String> lines = Files.readAllLines(recensement, StandardCharsets.UTF_8);
		List<String> lines100 = new ArrayList<>();
		for (int i=0; i<100; i++) {
			lines100.add(lines.get(i));
		}
		Path pathCible = home.resolve("./recensement100.csv");
		Files.write(pathCible, lines100);
	}

}
