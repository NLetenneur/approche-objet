package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		long debut = System.currentTimeMillis();
//		StringBuilder builderNombres = new StringBuilder();
//		for (int i=1; i<100001; i++) {
//			builderNombres.append(i+" ");
//		}
//		System.out.println(builderNombres);
		String nombres = "";
		for (int i=1; i<100001; i++) {
			nombres = nombres+i+" ";
		}
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		//Methode Stringbuilder : 54ms
		//Methode + : 2789ms

	}

}
