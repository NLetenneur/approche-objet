package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Salon monSalon = new Salon(10.6, 0);
		Piece[] tabPieces = { monSalon };
		Maison maMaison = new Maison(tabPieces);
		maMaison.ajouterPiece(null); //=> fait planter la compilation ==> corrigé
		WC toilettes = new WC(3, 0);
		maMaison.ajouterPiece(toilettes);
		double sup = maMaison.superficieEtage(0);
		System.out.println(sup);
		Chambre chambre01 = new Chambre(9.5, 1);
		maMaison.ajouterPiece(chambre01);
		System.out.println(maMaison.superficieTot());
		Chambre chambre02= new Chambre(8.6, 1);
		maMaison.ajouterPiece(chambre02);
		System.out.println(maMaison.superficieTypePiece("Chambre"));
		System.out.println(maMaison.nbTypePiece("WC"));
	}

}
