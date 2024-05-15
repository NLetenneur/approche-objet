package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {
		
		Ville ville1 = new Ville("Ville Test1", 5);
		Ville ville2 = new Ville("Ville Test1", 5);
		Ville ville3 = ville1;
		System.out.println(ville1.equals(ville2));
		System.out.println(ville1==ville2);
		System.out.println(ville1==ville3);
	}

}
