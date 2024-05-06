package fr.diginamic.formes;

public class Cercle extends Forme {
	private double rayon;
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public	double calculerSurface() {
		double surface = rayon*rayon*Math.PI;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		double perimetre = rayon*2*Math.PI;
		return perimetre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}



}
