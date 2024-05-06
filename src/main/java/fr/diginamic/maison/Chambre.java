package fr.diginamic.maison;

public class Chambre extends Piece {

	public Chambre(double superficie, int numEtage) {
		super(superficie, numEtage);
	}

	@Override
	public String getPieceName() {
		return "Chambre";
	};
}
