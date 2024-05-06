package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : " + premierCaractere);
		
		System.out.println(chaine.length());
		
		System.out.println(chaine.indexOf(';'));
		
		String familyName = chaine.substring(0, chaine.indexOf(';'));
		System.out.println(familyName.toUpperCase());
		System.out.println(familyName.toLowerCase());
		
		String[] tab = chaine.split(";");
		for (int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
		
		String nom = tab[0];
		String prenom = tab[1];
		double salaire = Double.parseDouble(tab[2].replace(" ", ""));
		
		Salarie sal01= new Salarie(nom, prenom, salaire);
		System.out.println(sal01);

	}

}
