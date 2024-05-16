package fr.diginamic.testenumeration;

public class TestEnumeration {

	// Utilisez une boucle pour afficher toutes les saisons.
	public static void main(String[] args) {
		for (int i = 0; i < Saison.values().length; i++) {
			System.out.println(Saison.values()[i]);
		}
		System.out.println("**************");

		// Soit la chaine de caractères suivante : String nom = « ETE » : Utilisez une
		// méthode de base des énumérations pour retrouver et afficher le libellé de
		// l’instance de Saison dont le nom est ETE.
		String nom = "ETE";
		Saison saison1 = Saison.valueOf(nom);
		System.out.println(saison1);
		System.out.println("**************");

		// Soit la chaine de caractères suivante : String libelle = « Hiver » ;
		// - Développez une méthode dans votre énumération qui retourne une instance de
		// Saison en fonction du libellé.
		// - Utilisez cette méthode afin de vérifier que c’est bien HIVER qui est
		// retournée lorsque vous la tester avec la variable libelle.
		String libelle = "Hiver";
		System.out.println(Saison.getSaisonFromNom(libelle));

	}

}
