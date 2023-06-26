package game;


public class Mission {
	
	boolean aceptMission;
	int aceptReward;
	int coinReward;
	Kingdom missionDest;
	String description;
	int powerReward;
	Kingdom missionOrigin;
	boolean isComplete;
	
		
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