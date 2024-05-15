package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// Utilisez la classe java.util.Calendar pour créer une instance de Date à la
		// date du 19 mai 2016 à 23h59 et 30 secondes et affichez-la au format suivant :
		// jour/mois/année
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date1 = cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date1Format = formateur.format(date1);
		System.out.println(date1Format);

		// Utilisez la classe java.util.Calendar pour créer une instance de Date à la
		// date du jour
		long millis = System.currentTimeMillis();
		Date date2 = new java.sql.Date(millis);
		
		//Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date2Format = formateur2.format(date2);
		System.out.println(date2Format);
		
		//Affichez la même instance avec le nom des jours et des mois en français
		SimpleDateFormat formateurFr = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.FRANCE);
		String date2Fr = formateurFr.format(date2);
		System.out.println(date2Fr);
		
		//russe
		SimpleDateFormat formateurRu = new SimpleDateFormat("EEEEE dd MMMM yyyy", new Locale("ru","RU"));
		String date2Ru = formateurRu.format(date2);
		System.out.println(date2Ru);
		
		//chinois 
		SimpleDateFormat formateurCh = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.CHINESE);
		String date2Ch = formateurCh.format(date2);
		System.out.println(date2Ch);
		
		//et allemand.
		SimpleDateFormat formateurGe = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.GERMAN);
		String date2Ge = formateurGe.format(date2);
		System.out.println(date2Ge);

	}

}
