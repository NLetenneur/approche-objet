package fr.diginamic.formes;

public class Rectangle extends Forme {
	protected double longueur;
	protected double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		double surface = longueur*largeur;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		double perimetre = (longueur * 2) + (largeur * 2);
		return perimetre;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	

}
