package game;

public class Frontier {
	
	Kingdom destination;
	private int cost;
	
	public Frontier(Kingdom destination, int cost) {
		this.destination = destination;
		this.setCost(cost);
		
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
}
