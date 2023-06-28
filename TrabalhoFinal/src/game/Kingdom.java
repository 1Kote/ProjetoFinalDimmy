package game;

import java.util.ArrayList;
import java.util.List;

public class Kingdom {
	private String nameK;//NOME DO REINO
	private boolean hasBeen;//VARIAVEL PARA VERIFICAR SE JÁ PASSOU NO REINO
	List<Frontier> frontiers;//LISTA DE ARESTAS(FRONTEIRAS) QUE CADA VERTICE(REINO) POSUI
	
	//CONSTRUTOR DE REINO
	public Kingdom(String nameK, boolean hasBeen) {
		this.setNameK(nameK);
		this.hasBeen = hasBeen;
		this.frontiers = new ArrayList<Frontier>();
	}

	public String getNameK() {
		return nameK;
	}

	public void setNameK(String nameK) {
		this.nameK = nameK;
	}
	
	public boolean isHasBeen() {
		return hasBeen;
	}

	public void setHasBeen(boolean hasBeen) {
		this.hasBeen = hasBeen;
	}

	//MÉTODO QUE CRIA UMA ARESTA(FRONTEIRA) EM UM VERTICE(REINO) SELECIONADO, CADA ARESTA CRIADA É ADICIONADA EM UMA LISTA
	public void makeFrontiers(Kingdom destination, int cost, int powerGem) {
		Frontier frontier = new Frontier(destination, cost, powerGem);//CRIAÇÃO DA ARESTA
		frontiers.add(frontier);//ARESTA ADICIONADA NA LISTA
	}
	
}

