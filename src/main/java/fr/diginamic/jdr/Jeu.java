package fr.diginamic.jdr;

import java.util.Scanner;

public class Jeu {

	public static void main(String[] args) {
		menuBase();
	}

	public static void menuBase() {
		Scanner scanner = new Scanner(System.in);
		// création du menu de base
		int choixBase = 0;
		Menu menuPerso = new Menu(1, "Créer un personnage");
		Menu menuCreature = new Menu(2, "Combattre une créature");
		Menu menuScore = new Menu(3, "Afficher le score");
		Menu menuQuit = new Menu(4, "Sortir");
		Menu[] menuBase = { menuPerso, menuCreature, menuScore, menuQuit };
		PJoueur joueur = new PJoueur();

		while ((choixBase != 4)&&(joueur.pointsDeVies>0)) {
			System.out.println("Faites votre choix : ");
			for (int i = 0; i < menuBase.length; i++) {
				System.out.println(menuBase[i].codeChoix + " " + menuBase[i].nomChoix);
			}
			choixBase = scanner.nextInt();
			if ((choixBase == 1) || (choixBase == 2) || (choixBase == 3) || (choixBase == 4)) {
				switch (choixBase) {
				case 1:
					joueur = new PJoueur();
					System.out.println("Votre personnage a bien été créé");
					break;
				case 2:
					int choixCreatures = (int) (Math.random() * (4 - 1) + 1);
					switch (choixCreatures) {
					case 1:
						Loup loup = new Loup();
						System.out.println("Vous combattez un loup !");
						loup.combattre(joueur);
						
						break;
						
					case 2:
						Gobelin gobelin = new Gobelin();
						System.out.println("Vous combattez un gobelin !");
						gobelin.combattre(joueur);
					
						break;
					case 3:
						Troll troll = new Troll();
						System.out.println("Vous combattez un troll !");
						troll.combattre(joueur);
						
					}

					break;
				case 3:
					joueur.afficherScore();
					break;

				default:
					System.out.println("Vous quittez le jeu");
				}
				
			} else {
				System.out.println("Merci de saisir 1, 2, 3 ou 4");
				menuBase();
				
			}
			
		}
	}
}
