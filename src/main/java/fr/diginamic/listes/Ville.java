package fr.diginamic.listes;

public class Ville {
	protected String nom;
	protected int nbHabitants;

	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
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
		return (nom.equals(other.getNom())&&(nbHabitants==other.nbHabitants));
	}

}
