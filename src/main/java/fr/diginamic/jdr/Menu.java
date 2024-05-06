package fr.diginamic.jdr;

public class Menu {
	protected int codeChoix;
	protected String nomChoix;
	
	public Menu(int codeChoix, String nomChoix) {
		super();
		this.codeChoix = codeChoix;
		this.nomChoix = nomChoix;
	}

	public int getCodeChoix() {
		return codeChoix;
	}

	public void setCodeChoix(int codeChoix) {
		this.codeChoix = codeChoix;
	}

	public String getNomChoix() {
		return nomChoix;
	}

	public void setNomChoix(String nomChoix) {
		this.nomChoix = nomChoix;
	}
	
	
}
