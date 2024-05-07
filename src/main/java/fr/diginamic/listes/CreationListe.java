package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> listeNb = new ArrayList<>(); 
		for (int i=1; i<=100; i++) {
			listeNb.add(i);
			
		}
		System.out.println(listeNb);
	}

}
