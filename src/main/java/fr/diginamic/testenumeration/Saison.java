package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	/** Le nom de la saison */
	String libelle;

	/** Le numéro attribué à la saison */
	int num;

	/**
	 * Constructor
	 * 
	 * @param libelle Nom de la saison
	 * @param num     Numéro attribué à la saison
	 */
	private Saison(String libelle, int num) {
		this.libelle = libelle;
		this.num = num;
	}

	/**
	 * Getter pour libelle
	 * 
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Getter pour num
	 * 
	 * @return num
	 */
	public int getNum() {
		return num;
	}
	
	public static Saison getSaisonFromNom(String libelle) {
		libelle = libelle.toUpperCase();
		return Saison.valueOf(libelle);
	}

}
