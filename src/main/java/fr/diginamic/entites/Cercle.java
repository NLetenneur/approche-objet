package fr.diginamic.entites;

public class Cercle {
	protected double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double getPerimeter() {
		return rayon*2*Math.PI;
	}
	
	public double getArea() {
		return rayon*rayon*Math.PI;
		
	}
	
	

}
