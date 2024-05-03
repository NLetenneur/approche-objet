package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		Operations ope = new Operations();
		System.out.println("addition : "+ope.calcul(56, 8645, '+'));
		System.out.println("soustration : "+ope.calcul(56, 864, '-'));
		System.out.println("multiplication : "+ope.calcul(56, 45, '*'));
		System.out.println("multiplication : "+ope.calcul(7, 45, 'x'));
		System.out.println("division : "+ope.calcul(475, 6, '*'));
		}

}
