package fr.diginamic.essais;
import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static String afficher(Forme forme) {
		String affichage = "Périmètre : "+forme.calculerPerimetre()+", Surface : "+forme.calculerSurface()+".";
		return affichage;
	}

}
