package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	double salMensuel;
	
	public Salarie(String nom, String prenom, double salMensuel) {
		super(nom, prenom);
		this.salMensuel = salMensuel;
	}



	@Override
	public double getSalaire() {
		return salMensuel;
			}

}
