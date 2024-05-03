package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOpe, double montantOpe) {
		super(dateOpe, montantOpe);
	}
	
	public String getType() {
		return "DEBIT";
	};

}
