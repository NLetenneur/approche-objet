package fr.diginamic.jdr;

import java.util.Scanner;

public class Jeu {

	public static void main(String[] args) {
		// initialisation de la saisie
				Scanner scanner = new Scanner(System.in);
		

		// création du menu de base
		int choixBase = 0;
		Menu menuPerso = new Menu(1, "Créer un personnage");
		Menu menuCreature = new Menu(2, "Combattre une créature");
		Menu menuScore = new Menu(3, "Afficher le score");
		Menu menuQuit = new Menu(4, "Sortir");
		Menu[] menuBase = { menuPerso, menuCreature, menuScore, menuQuit };
		PJoueur joueur = null;

		while ((choixBase != 4) && ((choixBase == 1) || (choixBase == 2) || (choixBase == 3))) {
			System.out.println("Faite votre choix : ");
			for (int i = 0; i < menuBase.length; i++) {
				System.out.println(menuBase[i].codeChoix + " " + menuBase[i].nomChoix);
			}
			choixBase = scanner.nextInt();
			if ((choixBase == 1) || (choixBase == 2) || (choixBase == 3)) {
				switch (choixBase) {
				case 1:
					if (joueur.equals(null)) {
						joueur = new PJoueur();
						System.out.println("Votre personnage a bien été créé");
					} else {
						System.out.println("Vous avez déjà créé un personnage ! Choisissez 2, 3 ou 4");
						choixBase = scanner.nextInt();
					}
					break;
				case 2:
					if (joueur.equals(null)) {
						System.out.println(
								"Vous n'avez pas de personnage ! Choississez 1 pour en créer 1 ou 4 pour sortir");
						choixBase = scanner.nextInt();
					} else {
						menuCombattreUneCreature(joueur);
					}
					break;
				case 3:
					joueur.afficherScore();

				}
			} else {
				System.out.println("Merci de saisir 1, 2, 3 ou 4");
				choixBase = scanner.nextInt();
			}
		}
		

	}

	private static void menuCombattreUneCreature(PJoueur joueur) {
		// initialisation de la saisie
				Scanner scanner = new Scanner(System.in);
				
		Menu menuLoup = new Menu(1, "Combattre un loup");
		Menu menuGob = new Menu(2, "Combattre un gobelin");
		Menu menuTroll = new Menu(3, "Combattre un Troll");
		Menu menuQuit = new Menu(4, "Sortir");
		Menu[] menuCreatures = {menuLoup, menuGob, menuTroll, menuQuit};
		
		int choixCreatures = 0;
		while ((choixCreatures != 4) && ((choixCreatures == 1) || (choixCreatures == 2) || (choixCreatures == 3))&&(joueur.pointsDeVies>0)) {
			System.out.println("Faite votre choix : ");
			for (int i = 0; i < menuCreatures.length; i++) {
				System.out.println(menuCreatures[i].codeChoix + " " + menuCreatures[i].nomChoix);
			}
			choixCreatures = scanner.nextInt();
			
		}
		
	}

}
