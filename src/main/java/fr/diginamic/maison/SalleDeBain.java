package fr.diginamic.maison;

public class SalleDeBain extends Piece {

	public SalleDeBain(double superficie, int numEtage) {
		super(superficie, numEtage);
	}
	@Override 
	public String getPieceName() {
		return "Salle de bain";
	};

}