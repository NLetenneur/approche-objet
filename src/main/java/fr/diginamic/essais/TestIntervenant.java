package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie londonJack = new Salarie("London", "Jack", 4895.45);
		System.out.println(londonJack.getSalaire());
		Pigiste arendtHannah = new Pigiste("Arendt", "Hannah", 10.4, 748.56);
		System.out.println(arendtHannah.getSalaire());
	}

}
