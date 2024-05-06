package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	double nbJoursTravMois;
	double salJournalier;

	public Pigiste(String nom, String prenom, double nbJoursTravMois, double salJournalier) {
		super(nom, prenom);
		this.nbJoursTravMois = nbJoursTravMois;
		this.salJournalier = salJournalier;
	}

	@Override
	public double getSalaire() {
		double salMois = nbJoursTravMois * salJournalier;
		return salMois;
	}

}
