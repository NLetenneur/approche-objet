package fr.diginamic.banque.entites;

public class Compte {
	private int numeroCompte;
	private double soldeCompte;
	
	public Compte(int numeroCompte, double soldeCompte) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	
	public int getNumero(){
		return numeroCompte;
	}
	
	public double getSolde() {
		return soldeCompte;
	}
	
	public void setSolde(double newSolde) {
		soldeCompte= newSolde;
	}
	
	public String toString() {
		return "numéro de compte : "+numeroCompte+", solde du compte : "+soldeCompte+".";
	}
	
	
}
