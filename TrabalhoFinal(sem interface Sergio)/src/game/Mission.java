package game;


public class Mission {
	
	int aceptReward;
	int coinReward;
	Kingdom missionDest;
	String description;
	int powerReward;
	Kingdom miissionOrigin;
	boolean isComplete;
	
		
	public Mission( Kingdom missionOrigin, Kingdom missionDest, int aceptReward, int coinReward, int powerReward, String description, boolean isComplete) {
		this.aceptReward = aceptReward;
		this.coinReward = coinReward;
		this.description = description;
		this.powerReward = powerReward;
		this.missionDest = missionDest;
		this.miissionOrigin = missionOrigin;
		this.isComplete = isComplete;
	}
	

	
}
