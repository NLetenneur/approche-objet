package fr.diginamic.tri;
import java.lang.Comparable;

public class Ville implements Comparable<Ville> {
	protected String nom;
	protected String codeDep;
	protected String nomRegion;
	protected int popTotale;
	
	public Ville(String nom, String codeDep, String nomRegion, int popTotale) {
		super();
		this.nom = nom;
		this.codeDep = codeDep;
		this.nomRegion = nomRegion;
		this.popTotale = popTotale;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopTotale() {
		return popTotale;
	}

	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}

	public int compareTo(Ville ville2) {
		return 0;
	}
		
	
	@Override
	public String toString() {
		return "Nom : "+this.nom+", Code département : "+this.codeDep+", Nom de la région : "+this.nomRegion+", Population totale : "+this.popTotale;
		
	}

}
