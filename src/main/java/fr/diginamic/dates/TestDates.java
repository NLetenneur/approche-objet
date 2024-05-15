package fr.diginamic.dates;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDates {

	public static void main(String[] args) throws ParseException {
		//Créez une instance de la classe java.util.Date à la date du jour en utilisant un de ses constructeurs
		Date dateJour = new Date();
		
		//Affichez l’instance ainsi créée au format suivant : jour/mois/année
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
		String dateJourFormat = formatter.format(dateJour);
		System.out.println(dateJourFormat);
		
		//Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30 secondes
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String chaine1 = "19/05/2016 23:59:30";
		Date date1 = formateur.parse(chaine1);
		System.out.println(date1);
		
		//Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String date1Format = formateur2.format(date1);
		System.out.println(date1Format);
		
		//Créez une instance de Date contenant la date/heure système et affichez-la au même format que ci-dessus
		String dateJourFormat2 = formateur2.format(dateJour);
		System.out.println(dateJourFormat2);
		
	}

}
