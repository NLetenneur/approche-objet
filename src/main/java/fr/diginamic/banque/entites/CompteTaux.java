package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	private double tauxRemuneration;

	public CompteTaux(int numero, double solde, double taux) {
		super(numero, solde);
		tauxRemuneration = taux;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Le taux de rémunération de ce compte est de "+tauxRemuneration+"%.";		
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	

}
