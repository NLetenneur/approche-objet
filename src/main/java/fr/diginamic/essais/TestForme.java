package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle01= new Cercle(5);
		Rectangle rect01 = new Rectangle(4, 5);
		Carre car01 = new Carre(7);
		
		System.out.println(AffichageForme.afficher(cercle01));
		System.out.println(AffichageForme.afficher(rect01));
		System.out.println(AffichageForme.afficher(car01));

	}

}
