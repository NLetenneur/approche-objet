package fr.diginamic.jdr;

public class Troll extends Creature {

	public Troll() {
		super(((int) (Math.random() * (15 - 10) + 10)), ((int) (Math.random() * (30 - 20) + 20)));
	}
	
	@Override
	public void getXP(PJoueur joueur) {
		joueur.score = joueur.score + 5;

	}

}
