package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		Cercle circle01 = new Cercle(45);
		Cercle circle02 = new Cercle(9.43);
		System.out.println("Périmètre : "+circle01.getPerimeter()+", Surface : "+circle01.getArea());
		System.out.println("Périmètre : "+circle02.getPerimeter()+", Surface : "+circle02.getArea());	
	}

}
