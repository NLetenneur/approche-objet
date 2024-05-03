package fr.diginamic.operations;

public class Operations {

	public double calcul(double a, double b, char ope) {
		double solution = 0;
		switch(ope){
			case ('+') :solution = a+b;
			break;
			case ('-'):solution = a-b;
			break;
			case('*'):
			case('x'):
			solution = a*b;
			break;
			case('/'):solution = a/b;
			break;
			default:System.out.println("Vous avez entré un opérateur erroné !");
			break;
	}
		return solution; }

}
