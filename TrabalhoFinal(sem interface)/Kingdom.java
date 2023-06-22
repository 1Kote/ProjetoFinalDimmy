package game;

import java.util.ArrayList;
import java.util.List;

public class Kingdom {
	private String nameK;
	List<Frontier> frontiers;
	
	public Kingdom(String nameK) {
		this.setNameK(nameK);
		this.frontiers = new ArrayList<Frontier>();
		
	}

	public String getNameK() {
		return nameK;
	}

	public void setNameK(String nameK) {
		this.nameK = nameK;
	}
	
	public void makeFrontiers(Kingdom destination, int cost) {
		Frontier frontier = new Frontier(destination, cost);
		frontiers.add(frontier);
	}
	
	
}

