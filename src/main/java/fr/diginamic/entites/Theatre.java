package fr.diginamic.entites;

public class Theatre {
	private String name;
	private int maxCapacity;
	private int nbClients;
	private double revenue;

	public Theatre(String name, int maxCapacity, int nbClients, double revenue) {
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.nbClients = nbClients;
		this.revenue = revenue;
	}

	public Theatre(String name, int maxCapacity) {
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.nbClients = 0;
		this.revenue = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getNbClients() {
		return nbClients;
	}

	public void setNbClients(int nbClients) {
		this.nbClients = nbClients;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public void inscrire(int nbClients, double pxPlace) {
		int expectedAttendance = this.nbClients + nbClients;
		if (expectedAttendance > maxCapacity) {
			System.out.println("Cette inscription ne peut être effectuée, il ne reste plus que "+(maxCapacity-this.nbClients)+" places");
		} else {
			this.nbClients = expectedAttendance;
			revenue = revenue + (nbClients*pxPlace);
			System.out.println("Inscription effectuée ! Il reste "+(maxCapacity-this.nbClients)+" places");
		}

	}
}
