package game;


public class Mission {
	
	int aceptReward;//RECOMPENSA POR ACEITAR A MISSÃO
	int coinReward;//RECOMPENSA DE MOEDAS
	Kingdom missionDest;//DESTINO DA MISSÃO
	String description;//DESCRIÇÃO DA MISSÃO
	int powerReward;//RECCOMPENSA DE PODER
	Kingdom missionOrigin;//ORIGEM DA MISSÃO
	boolean isComplete;//VERIFICAVEL SE AMISSÃO ESTÁ COMPLETA
	
	//CONSTRUTOR DE MISSÃO	
	public Mission( Kingdom missionOrigin, Kingdom missionDest, int aceptReward, int coinReward, int powerReward, String description, boolean isComplete) {
		this.aceptReward = aceptReward;
		this.coinReward = coinReward;
		this.description = description;
		this.powerReward = powerReward;
		this.missionDest = missionDest;
		this.missionOrigin = missionOrigin;
		this.isComplete = isComplete;
	}
	

	
}
