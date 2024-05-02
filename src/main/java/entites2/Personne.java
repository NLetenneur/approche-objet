package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prénom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prénom) {
		this.nom =nom;
		this.prénom =prénom;
	}
	
	public Personne(String nom, String prénom, AdressePostale adresse) {
		this.nom =nom;
		this.prénom =prénom;
		this.adresse =adresse;
	}

}
