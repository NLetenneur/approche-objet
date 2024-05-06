package fr.diginamic.jdr;


public class PJoueur extends Personnage {
	int score;
	
	public PJoueur() {
		super(((int) (Math.random()*(18-12)+12)),((int) (Math.random()*(50-20)+20)));
		this.score = 0;
	}
	
	public void afficherScore() {
		System.out.println("Votre score est :"+score);
	}
	

}
