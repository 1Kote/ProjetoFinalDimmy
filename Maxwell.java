//Classe do Personagem Maxwell
public class Maxwell {
	private String currentCity;
	private int transportCoin;
	private int powerJoia;
	private int powerthreshold;

public Maxwell() {
	currentCity = "00-UBU";
	transportCoin = 3;
	powerJoia = 0;
	powerthreshold = 7;
	
}

public String getCurrentCity() {
	return currentCity;
}

public void setCurrentCity(String currentCity) {
	this.currentCity = currentCity;
}

public int getPowerJoia() {
	return powerJoia;
}

public void setPowerJoia(int powerJoia) {
	this.powerJoia = powerJoia;
}

public int getTransportCoin() {
	return transportCoin;
}

public void setTransportCoin(int transportCoin) {
	this.transportCoin = transportCoin;
}

public int getPowerthreshold() {
	return powerthreshold;
}

public void setPowerthreshold(int powerthreshold) {
	this.powerthreshold = powerthreshold;
}

	//metodo para realizar uma missão
public void accomplishMission(Mission mission) {
	if (transportCoin >= mission.getCoustMission()){
		System.out.println("Missão Aceita!");

		//Reduzir o numero de moedas de transporte de acordo com o custo da missão
		transportCoin -= mission.getCoustMission();

		//atulizar o limiar de poder de acordo com a missão
		powerthreshold += mission.get.ThresholdIncrease();
		System.out.printlln("Prêmio da missão recebido!")
		
		//especificidades da missão, caso tenha
		//atualizar outros atributos
		
	} else{
		System.out.println("Moedas insuficientes para realizar missão!")
	}
}

public void exchangeCoinsL(int amountCoins) {
	if(transportCoin >= amountCoins){
		// verificar se a distancia é menor que 3
		boolean distanceThree = calcularDistance() < 3;
		// verificar quantidade de moedas se é menor que 5
		boolean CoinLowFive = transportCoin < 5;
		if ((CoinLowFive && distanceThree) || (!CoinLowFive && !distanceThree)){
		System.out.println("Você trocou " + amountCoins + " moedas por limiar na jóia.");

		transportCoin -= amountCoins;
		
		if (distanceThree){
			powerthreshold += 1;
		} else {
			powerthreshold -= 2;
		}
			System.out.println("Limiar de poder da jóia atualizado: " + limiarPoder);
			//mais ações sobre a troca de moedas por poder
		} else {
			System.out.println("A quantidade de moedas e a distância não estão de acordo com as regras para trocar por limiar.")
				
		} else {
			System.out.println("Você não tem moedas de transporte suficientes para realizar a troca.");
		}
	}
}
                                                                             
}
	
