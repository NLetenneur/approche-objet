package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		double[] tab1 = {18,38.5, 9};
		double[] tab2 = {4856,9,354.78,86};
		
		CalculMoyenne cm1 = new CalculMoyenne(tab1);
		System.out.println(cm1.averageTableau());
		cm1.addToTableau(28.64);
		System.out.println(cm1.averageTableau());
		
		CalculMoyenne cm2 = new CalculMoyenne(tab2);
		System.out.println(cm2.averageTableau());
		cm2.addToTableau(64895.54);
		System.out.println(cm2.averageTableau());
	}

}
