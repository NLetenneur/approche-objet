package fr.diginamic.formes;

public class Carre extends Rectangle {
	public Carre(double longueur) {
		super(longueur, longueur);
		
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	@Override
	public double calculerSurface() {
		double surface = longueur*longueur;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		double perimetre = longueur * 4;
		return perimetre;
	}

}
