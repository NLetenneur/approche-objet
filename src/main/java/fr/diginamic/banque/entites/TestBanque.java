package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte monCompte = new Compte(654, 8343.58);
		System.out.println(monCompte);
		System.out.println(monCompte.numeroCompte);

	}

}
