package fr.diginamic.jdr;
import java.lang.Math;

public abstract class Personnage {
	int force;
	int pointsDeVies;

	public Personnage(int force, int pointsDeVie) {
		this.force = force;
		this.pointsDeVies = pointsDeVie;
	}

}
