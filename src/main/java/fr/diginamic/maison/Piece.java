package fr.diginamic.maison;

public abstract class Piece {
	public double superficie;
	public int numEtage;

	public Piece(double superficie, int numEtage) {
		double minSuper = 0;
		double maxSuper = 200;
		if (minSuper<= superficie && superficie <= maxSuper) {
			this.superficie = superficie;
		} else {
			System.out.println("La superficie est invalide");
		}		
		int minEtage = 0;
		int maxEtage = 10;
		if (minEtage <= numEtage && numEtage <= maxEtage) {
			this.numEtage = numEtage;
		} else {
			System.out.println("Le numéro d'étage est invalide");
		}
	}
	public abstract String getPieceName();
}
