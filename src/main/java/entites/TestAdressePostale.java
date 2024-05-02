package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale ad1 = new AdressePostale();
		ad1.numeroRue=1;
		ad1.libelleRue="rue de Morlaix";
		ad1.codePostal=44800;
		ad1.ville="Saint Herblain";
		
		AdressePostale ad2 = new AdressePostale();
		ad2.numeroRue=5;
		ad2.libelleRue="rue des Maréchaux";
		ad2.codePostal=44100;
		ad2.ville="Nantes";
	}

}
