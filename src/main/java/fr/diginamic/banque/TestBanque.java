package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;


public class TestBanque {

	public static void main(String[] args) {
		Compte monCompte = new Compte(654, 8343.58);
		CompteTaux deuxiemeCompte = new CompteTaux(456, 564.12, 2.6);
		
		Compte[] tousMesComptes = {monCompte, deuxiemeCompte};
		
		for (int i=0; i<tousMesComptes.length; i++) {
			System.out.println(tousMesComptes[i]);
		}
	}

}
