package fr.diginamic.jdr;

public abstract class Creature extends Personnage {

	public Creature(int force, int pointsDeVie) {
		super(force, pointsDeVie);
	}

	public abstract void getXP(PJoueur joueur);

	public void combattre(PJoueur joueur) {
		while ((joueur.pointsDeVies > 0) && (this.pointsDeVies > 0)) {
			int attJoueur = joueur.force + ((int) (Math.random() * (10 - 1) + 1));
			int attCreature = this.force + ((int) (Math.random() * (10 - 1) + 1));
			if (attJoueur > attCreature) {
				this.pointsDeVies = this.pointsDeVies - (attJoueur - attCreature);
			} else if (attJoueur < attCreature) {
				joueur.pointsDeVies = joueur.pointsDeVies - (attCreature - attJoueur);
			}
		}
		if (joueur.pointsDeVies >= 0) {
			System.out.println("Vous avez gagné ! Points de vie restants : "+joueur.pointsDeVies);
			getXP(joueur);
		}else {
			System.out.println("Votre personnage est décédé. Il a obtenu le score de " + joueur.score
					+ " points. Veuillez créer un nouveau personnage");}
			
	}

}
