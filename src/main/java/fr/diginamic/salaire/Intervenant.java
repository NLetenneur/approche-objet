package fr.diginamic.salaire;

public abstract class Intervenant {
	String nom;
	String prenom;
	
	 public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();

}
