package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville>{
	protected String nom;
	protected String codeDep;
	protected String nomRegion;
	protected int popTotale;
	
	@Override
	public int compare(Ville ville1, Ville ville2) {
		int result = ville1.nom.compareTo(ville2.getNom());
		return result;
	}
}
