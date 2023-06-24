package game;

import java.util.ArrayList;
import java.util.List; 
import java.util.Scanner;


public class MainTeste {
	
	

	public static void main(String[] args) {
		Node rootNode;
		//CRIANDO OS REINOS
		Kingdom UBU = new Kingdom("UBUD");
		Kingdom KLE = new Kingdom("KINGDOM OF LEGEND");
		Kingdom PNE = new Kingdom("PRINDIPALITY OF NEKIKA");
		Kingdom PGR = new Kingdom("PRINCIPALITY OF GRITESTAR");
		Kingdom PDO = new Kingdom("PROTECTORATE OF DOGROVE");
		Kingdom KLA = new Kingdom("KINGDOM OF LASTWACTH");
		Kingdom GDS = new Kingdom("GRAND DUCHY OF SMALIA");
		Kingdom KOL = new Kingdom("KINGDOM OF OLDACIA");
		Kingdom DEF = new Kingdom("DEFALSIA");
		Kingdom KKA = new Kingdom("KINGDOM OF KALB");
		Kingdom ALE = new Kingdom("AYAMAR LEAGUE");
		Kingdom PKR = new Kingdom("PRINCIPALITY OF KARHORA");
		Kingdom VEM = new Kingdom("VUNESE EMPIRE");
		Kingdom CSU = new Kingdom("CHANDIR SULTANATE");
		Kingdom PKS = new Kingdom("PRINCIPALITY OF KASYA");
		Kingdom BUN = new Kingdom("BUN");
		Kingdom NAR = new Kingdom("NARGUMUN");
		
		//FRONTEIRAS DE UBUD
		UBU.makeFrontiers(KLE, 1, 2);
		UBU.makeFrontiers(PNE, 1, 1);
		
		//FRONTEIRAS DE KINGDOM OF LEGEND
		KLE.makeFrontiers(UBU, 1, 0);
		KLE.makeFrontiers(PNE, 1, 1);
		KLE.makeFrontiers(PGR, 1, 5);
		KLE.makeFrontiers(PDO, 1, 3) ;
		KLE.makeFrontiers(KOL, 1, 4);
		
		//FRONTEIRAS DE PRINCIPALITY OF NEKIKA
		PNE.makeFrontiers(UBU, 1, 0);
		PNE.makeFrontiers(KLE, 1, 2);
		PNE.makeFrontiers(PGR, 1, 5);
		PNE.makeFrontiers(PDO, 1, 3);
		
		//FRONTEIRAS DE PRINCIPALITY OF GRITESTAR
		PGR.makeFrontiers(PNE, 1, 1);
		PGR.makeFrontiers(KLE, 1, 2);
		PGR.makeFrontiers(PDO, 1, 3);
		PGR.makeFrontiers(KLA, 1, -2);
		
		//FRONTEIRAS DE PROTECTORATE OF DOGROVE
		PDO.makeFrontiers(KLE, 1, 2);
		PDO.makeFrontiers(PNE, 1, 1);
		PDO.makeFrontiers(PGR, 1, 5);
		PDO.makeFrontiers(KOL, 1, 4);
		PDO.makeFrontiers(KLA, 1, -2);
		
		//FRONTEIRAS DE KINGDOM OF LASTWATCH
		KLA.makeFrontiers(PGR, 1, 5);
		KLA.makeFrontiers(PDO, 1, 3);
		KLA.makeFrontiers(GDS, 1, 1);
		KLA.makeFrontiers(KOL, 1, 4);
		
		//FRONTEIRAS DE GRAND DUCHY OF SMALIA
		GDS.makeFrontiers(KLA, 1, -2);
		GDS.makeFrontiers(KOL, 1, 4);
		
		//FRONTEIRAS DE KINGDOM OF OLDCALIA
		KOL.makeFrontiers(KLE, 1, 2);
		KOL.makeFrontiers(PDO, 1, 3);
		KOL.makeFrontiers(KLA, 1, -2);
		KOL.makeFrontiers(GDS, 1, 1);
		KOL.makeFrontiers(DEF, 1, -3);
		KOL.makeFrontiers(ALE, 1, 1);
		KOL.makeFrontiers(KKA, 1, 2);
		
		//FRONTEIRAS DE DEFALSIA
		DEF.makeFrontiers(KOL, 1, 4);
		DEF.makeFrontiers(ALE, 1, 1);
		
		//FRONTEIRAS DE KINGDOM OF KALB
		KKA.makeFrontiers(KOL, 1, 4);
		KKA.makeFrontiers(ALE, 1, 1);
		KKA.makeFrontiers(VEM, 1, 0);
		
		//FRONTEIRAS DE AYAMAR LEAGUE
		ALE.makeFrontiers(KOL, 1, 4);
		ALE.makeFrontiers(DEF, 1, -3);
		ALE.makeFrontiers(KKA, 1, 2);
		ALE.makeFrontiers(VEM, 1, 0);
		ALE.makeFrontiers(CSU, 1, 1);
		ALE.makeFrontiers(BUN, 1, 5);
		ALE.makeFrontiers(NAR, 1, 0);
		ALE.makeFrontiers(PKR, 1, -2);
		
		//FRONTEIRAS DE VUNESE EMPIRE
		VEM.makeFrontiers(KKA, 1, 2);
		VEM.makeFrontiers(ALE, 1, 1);
		VEM.makeFrontiers(CSU, 1, 1);
		
		//FRONTEIRAS DE CHANDIR SULTANATE
		CSU.makeFrontiers(VEM, 1, 0);
		CSU.makeFrontiers(ALE, 1, 1);
		CSU.makeFrontiers(BUN, 1, 5);
		CSU.makeFrontiers(PKS, 1, -7);
		
		//FRONTEIRAS DE PRINCIPALITY OF KASYA
		PKS.makeFrontiers(CSU, 1, 1);
		
		//FRONTEIRAS DE BUN
		BUN.makeFrontiers(NAR, 1, 0);
		BUN.makeFrontiers(ALE, 1, 1);
		BUN.makeFrontiers(CSU, 1, 1);
		
		//FRONTEIRAS DE PRINCIPALITY OF KARHORA
		PKR.makeFrontiers(NAR, 1, 0);
		PKR.makeFrontiers(ALE, 1, 1);
		
		//FRONTEIRAS DE NARGUMUN
		NAR.makeFrontiers(ALE, 1, 1);
		NAR.makeFrontiers(BUN, 1, 5);
		NAR.makeFrontiers(PKR, 1, -2);
		
		initiatePlay(UBU,3, 0, 7);
		
	}
	
	public static String lerRespostaDoUsuario() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
	

	public static void initiatePlay(Kingdom initialLoc, int initialCoins, int initialPowerGem, int initialPowerLimit) {
		
		Kingdom currentLoc = initialLoc;
		int coins = initialCoins;  
		int powerGem = initialPowerGem;
		int powerLimit = initialPowerLimit;
		
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("loc atual " + currentLoc.getNameK());
			System.out.println("dinheiro atual " + coins);
			System.out.println("Poder da joia: " + powerGem + "/" + powerLimit );
			
			
			
			
			List<Frontier> frontiers = currentLoc.frontiers;
			System.out.println("Escolha uma cidade para viajar:");
			for (int i = 0; i < frontiers.size();i++) {
			Frontier frontier = frontiers.get(i);
			System.out.println((i+1) + ".Reino: " + frontier.destination.getNameK() + "(custo: " + frontier.getCost() +") " + "(Poder ganho/perdido: " + frontier.powerGem + ")" );                                  
				
		}
		
			
			
		
	
			int choice = scn.nextInt();
		
			if(choice == 11) {
			break;
		}
		
			Frontier choicedKingdom = frontiers.get(choice - 1);
			
           	 powerGem += choicedKingdom.powerGem;		
			coins-= choicedKingdom.getCost();
			currentLoc = choicedKingdom.destination;		
			System.out.println("VIAJANDO PARA: " + currentLoc.getNameK());
		
		}
	}
				
}
