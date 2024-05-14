package fr.diginamic.automates;

public class Cell {
	int y;
	int x;
	Boolean isAlive;

	public Cell(int y, int x, Boolean isAlive) {
		super();
		this.y = y;
		this.x = x;
		this.isAlive = isAlive;
	}
	
	@Override
	public String toString() {
		return this.y+""+this.x+":"+this.isAlive;
	}
}
