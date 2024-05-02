package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne moi = new Personne();
		moi.nom="Letenneur";
		moi.prénom="Noémie";
		moi.adresse=new AdressePostale();
		moi.adresse.numeroRue=1;
		moi.adresse.libelleRue="rue de Morlaix";
		moi.adresse.codePostal=44800;
		moi.adresse.ville="Saint Herblain";
		
		Personne autre = new Personne();
		autre.nom="Doe";
		autre.prénom="Jane";
		autre.adresse = new AdressePostale();
		autre.adresse.numeroRue=5;
		autre.adresse.libelleRue="rue des Maréchaux";
		autre.adresse.codePostal=44100;
		autre.adresse.ville="Nantes";
	}

}
