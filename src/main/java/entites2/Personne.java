package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	public Personne(String nom, String prénom) {
		this.nom = nom;
		this.prenom = prénom;
	}

	public Personne(String nom, String prénom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prénom;
		this.adresse = adresse;
	}

	public void afficherIdentite() {
		System.out.println("Cette personne est " + nom.toUpperCase() + " " + prenom + ".");
	}

	public void modifierNom(String nouveauNom) {
		nom = nouveauNom;
	}

	public void modifierPrenom(String nouveauPrenom) {
		prenom = nouveauPrenom;
	}
	
	public void modifierAdresse(AdressePostale nouvelleAdresse) {
		adresse = nouvelleAdresse;
	}
	
	public String retourNom() {
		return nom;
	}
	
	public String retourPrenom() {
		return prenom;
	}
	
	public AdressePostale retourAdresse() {
		return adresse;
	}

}
