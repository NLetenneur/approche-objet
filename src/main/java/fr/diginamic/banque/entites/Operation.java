package fr.diginamic.banque.entites;

public abstract class Operation {
	String dateOpe;
	double montantOpe;
	
	public Operation(String dateOpe, double montantOpe) {
		this.dateOpe = dateOpe;
		this.montantOpe = montantOpe;
	}

	public String getDateOpe() {
		return dateOpe;
	}

	public void setDateOpe(String dateOpe) {
		this.dateOpe = dateOpe;
	}

	public double getMontantOpe() {
		return montantOpe;
	}

	public void setMontantOpe(double montantOpe) {
		this.montantOpe = montantOpe;
	}
	
	public abstract String getType();
}
