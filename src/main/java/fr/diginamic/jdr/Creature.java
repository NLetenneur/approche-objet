package fr.diginamic.jdr;

public abstract class Creature extends Personnage {

	public Creature(int force, int pointsDeVie) {
		super(force, pointsDeVie);
	}
	
	public abstract void getXP(PJoueur joueur);
	}

}
