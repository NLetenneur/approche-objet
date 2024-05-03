package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		Credit cred1 = new Credit("03/04/2024", 53.1);
		Credit cred2 = new Credit("10/04/2024", 1523.35);
		Debit deb1 = new Debit("09/04/2024", 38.14);
		Debit deb2 = new Debit("02/05/2024", 864.25);
		double solde = 0;
		
		Operation[] tabOpe = {cred1, cred2, deb1, deb2};
		
		for (int i=0; i<tabOpe.length; i++) {
			if (tabOpe[i].getType().equals("DEBIT")) {
				solde = solde-tabOpe[i].getMontantOpe();
			}else {
				solde = solde+tabOpe[i].getMontantOpe();
			}
			System.out.println("Date : "+tabOpe[i].getDateOpe()+", Montant : "+tabOpe[i].getMontantOpe()+", Type: "+tabOpe[i].getType());
			
			}
		System.out.println(solde);
		

	}

}
