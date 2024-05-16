package fr.diginamic.testenumeration;

public enum Continent {
	EUROPE("Europe"), AFRIQUE("Afrique"), AMERIQUE("Amérique"), OCEANIE("Océanie"), ASIE("Asie"),
	ANTARTIQUE("Antartique");

	String libelle;

	/**
	 * Constructor
	 * 
	 * @param libelle Nom du continent
	 */
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter pour libelle
	 * 
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}

}
