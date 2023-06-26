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
	
	public void executeMission(){
		// Verificar se o jogador tem recursos suficientes para aceitar a missão
		if(Maxwell.getCoin() >= aceptReward){
			//Exibir a descrição da missão para o jogador
			System.out.println(description);

			//Pergunta se deseja aceitar
			boolean aceptMission = maxwell.responderSimOuNao();

			if(aceptMission){
				// Verificar se o jogador está na cidade de origem da missão
            if (maxwell.getLocation() == missionOrigin) {
                // Verificar se o jogador tem recursos suficientes para concluir a missão
                if (maxwell.getCoin() >= coinReward) {
                    // Executar ações para concluir a missão
                    // Atualizar os atributos do jogador conforme necessário (moedas, poder, etc.)
                    maxwell.removeCoin(coinReward);
                    maxwell.increasePower(powerReward);

                    // Marcar a missão como concluída
                    isComplete = true;

                    // Exibir mensagem de sucesso para o jogador
                    System.out.println("Missão concluída com sucesso!");

                    // Atualizar o estado do jogo
                    updateGameState();
				} else {
					// Exibir mensagem de que o jogador não tem moedas suficientes
                    System.out.println("Você não tem moedas suficientes para concluir a missão.");
				}
			} else {
				// Exibir mensagem de que o jogador não está na cidade correta
                System.out.println("Você está na cidade errada para essa missão.");
			}
		} else {
			// Exibir mensagem de que o jogador recusou a missão
            System.out.println("Você recusou a missão.");
		}
	} else {
		// Exibir mensagem de que o jogador não tem moedas suficientes para aceitar a missão
        System.out.println("Você não tem moedas suficientes para aceitar a missão.");
	}
}
	public boolean isMissionComplete(){
		
	}

	public void updateGameState(){

	}
	
}
