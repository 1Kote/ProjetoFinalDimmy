package game;

public class Frontier {
	
	Kingdom destination;//DESTINO DA ARESTA
	private int cost;//CUSTO DE VIAGEM
	int powerGem;//PODER GANHO OU PERDIDO (VARIA DE ACORDO COM O PAÍS)
	
	//CONSTRUTOR DE FRONTEIRAS
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
