package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne moi = new Personne("Letenneur", "Noémie");
		moi.adresse = new AdressePostale(1, "rue de Morlaix", 44800,"Saint Herblain");

		Personne autre = new Personne("Doe", "Jane", new AdressePostale(5, "rue des Maréchaux", 44100, "Nantes"));
		
		moi.afficherIdentite();
		autre.modifierNom("Martin");
		autre.afficherIdentite();
		autre.modifierPrenom("Martine");
		autre.afficherIdentite();
		
		AdressePostale adresseBidon = new AdressePostale(96, "rue Pablo Picasso", 45000, "Orléans");
		
		autre.modifierAdresse(adresseBidon);
		
		Personne encoreAutre = new Personne("Baldwin", "James");
		
		encoreAutre.modifierAdresse(adresseBidon);
		encoreAutre.afficherIdentite();
		
	}

}
