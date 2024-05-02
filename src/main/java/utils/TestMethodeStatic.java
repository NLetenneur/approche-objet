package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "12";
		System.out.println(chaine);
		int number =  Integer.parseInt(chaine);
		System.out.println(number);
		int otherNumber = Integer.valueOf(chaine);
		System.out.println(otherNumber);
		
		int a = 86;
		int b = 456; 
		int supp = Integer.max(a, b);
		
		System.out.println(supp);
	}

}