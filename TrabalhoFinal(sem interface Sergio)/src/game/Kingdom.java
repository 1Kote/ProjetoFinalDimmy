package game;

import java.util.ArrayList;
import java.util.List;

public class Kingdom {
	private String nameK;
	private boolean talked;
	List<Frontier> frontiers;
	
	
	public Kingdom(String nameK, boolean jaaPassou) {
		this.setNameK(nameK);
		this.talked = talked;
		this.frontiers = new ArrayList<Frontier>();
	}

	public String getNameK() {
		return nameK;
	}

	public void setNameK(String nameK) {
		this.nameK = nameK;
	}
	
	public boolean isJaPassou() {
		return talked;
	}

	public void setJaPassou(boolean jaPassou) {
		this.talked = jaPassou;
	}

	public void makeFrontiers(Kingdom destination, int cost, int powerGem) {
		Frontier frontier = new Frontier(destination, cost, powerGem);
		frontiers.add(frontier);
	}
	
	
	
}

