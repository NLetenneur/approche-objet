package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	double[] tableau;

	public CalculMoyenne(double[] tableau) {
		this.tableau = tableau;
	}

	public double[] getTableau() {
		return tableau;
	}

	public void setTableau(double[] tableau) {
		this.tableau = tableau;
	}
	
	public void addToTableau(double nouvEntree) {
		tableau = Arrays.copyOf(tableau, tableau.length+1);
		tableau[tableau.length-1]= nouvEntree;
	}
	
	public double averageTableau() {
		double sum = 0;
		for (int i=0; i<tableau.length; i++) {
			sum =sum+tableau[i];
		}
		return sum/tableau.length;
	}
	

}
