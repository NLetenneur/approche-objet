package fr.diginamic.testenumeration;

public class Ville {
	/** Nom de la ville */
	protected String nom;
	/** Nombre d'habitants de la ville */
	protected int nbHabitants;
	/** Continent sur lequel se trouve la ville */
	protected Continent continent;

	/**
	 * Constructor d'une ville
	 * 
	 * @param nom         Nombre d'habitants de la ville
	 * @param nbHabitants Nombre d'habitants de la ville
	 * @param continent   Continent sur lequel se trouve la ville
	 */
	public Ville(String nom, int nbHabitants, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

	/**
	 * Getter pour le nom de la villes
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour le nom de la ville
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour le nombre d'habitants de la ville
	 * 
	 * @return nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * Setter pour le nombre d'habitants de la ville
	 * 
	 * @param nbHabitants
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Getter pour continent
	 * 
	 * @return continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * Setter pour continent
	 * 
	 * @param continent continent
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return nom + ": " + nbHabitants + " habitants";
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) object;
		return (nom.equals(other.getNom()) && (nbHabitants == other.nbHabitants));
	}

}
