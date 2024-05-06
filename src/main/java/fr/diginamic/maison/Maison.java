package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	Piece[] tabPieces;

	public Maison(Piece[] tabPieces) {
		this.tabPieces = tabPieces;
	}

	public void ajouterPiece(Piece piece) {
		if (piece == null) {
			System.out.println("La pièce à ajouter ne peut être 'null'");
		} else {
			tabPieces = Arrays.copyOf(tabPieces, tabPieces.length + 1);
			tabPieces[tabPieces.length - 1] = piece;
		}
	}

	public double superficieTot() {
		double superficie = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			superficie = superficie + tabPieces[i].superficie;
		}
		return superficie;
	}

	public double superficieEtage(int etage) {
		double superficie = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].numEtage == etage) {
				superficie = superficie + tabPieces[i].superficie;
			}
		}
		return superficie;
	}

	public double superficieTypePiece(String nomPiece) {
		double superficie = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getPieceName().equals(nomPiece)) {
				superficie = superficie + tabPieces[i].superficie;
			}
		}
		return superficie;
	}
	
	public int nbTypePiece(String nomPiece) {
		int nbPieces = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getPieceName().equals(nomPiece)) {
				nbPieces++;
			}
		}
		return nbPieces;
	}
}
