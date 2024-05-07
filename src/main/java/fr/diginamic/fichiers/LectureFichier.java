package fr.diginamic.fichiers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		Path recensement = Paths.get("C:\\Users\\nlete\\git\\approche-objet\\src\\main\\java\\fr\\diginamic\\fichiers\\recensement.csv");
		boolean exists = Files.exists(recensement);
		if (exists) {
			List<String> lines = Files.readAllLines(recensement, StandardCharsets.UTF_8);
			System.out.println(lines);
		}
	}

}
