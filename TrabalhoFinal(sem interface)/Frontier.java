package game;

public class Frontier {
	
	Kingdom destination;
	private int cost;
	int powerGem;
	
	public Frontier(Kingdom destination, int cost, int powerGem) {
		this.destination = destination;
		this.setCost(cost);
		this.powerGem = powerGem;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
}
