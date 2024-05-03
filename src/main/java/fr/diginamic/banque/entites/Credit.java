package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOpe, double montantOpe) {
		super(dateOpe, montantOpe);
	}
	
	public String getType() {
		return "CREDIT";
	};

}
