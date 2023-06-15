package game;

import java.util.List;

public class MainTeste {
	
	

	public static void main(String[] args) {
		
		
		Kingdom UBU = new Kingdom("UBU");
		Kingdom KLE = new Kingdom("KLE");
		Kingdom PNE = new Kingdom("PNE");
		Kingdom PGR = new Kingdom("PGR");
		Kingdom PDO = new Kingdom("PDO");
		Kingdom KLA = new Kingdom("KLA");
		Kingdom GDS = new Kingdom("GDS");
		Kingdom KOL = new Kingdom("KOL");
		Kingdom DEF = new Kingdom("DEF");
		Kingdom KKA = new Kingdom("KKA");
		Kingdom ALE = new Kingdom("ALE");
		Kingdom PKR = new Kingdom("PKR");
		Kingdom VEM = new Kingdom("VEM");
		Kingdom CSU = new Kingdom("CSU");
		Kingdom PKS = new Kingdom("PKS");
		Kingdom BUN = new Kingdom("BUN");
		Kingdom NAR = new Kingdom("NAR");
		
		
		//FRONTEIRAS DE UBUD
		UBU.makeFrontiers(KLE, 1);
		UBU.makeFrontiers(PNE, 1);
		
		//FRONTEIRAS DE KINGDOM OF LEGEND
		KLE.makeFrontiers(UBU, 1);
		KLE.makeFrontiers(PNE, 1);
		KLE.makeFrontiers(PGR, 1);
		KLE.makeFrontiers(PDO, 1);
		KLE.makeFrontiers(KOL, 1);
		
		//FRONTEIRAS DE PRINCIPALITY OF NEKIKA
		PNE.makeFrontiers(UBU, 1);
		PNE.makeFrontiers(KLE, 1);
		PNE.makeFrontiers(PGR, 1);
		PNE.makeFrontiers(PDO, 1);
		
		//FRONTEIRAS DE PRINCIPALITY OF GRITESTAR
		PGR.makeFrontiers(PNE, 1);
		PGR.makeFrontiers(KLE, 1);
		PGR.makeFrontiers(PDO, 1);
		PGR.makeFrontiers(KLA, 1);
		
		//FRONTEIRAS DE PROTECTORATE OF DOGROVE
		PDO.makeFrontiers(KLE, 1);
		PDO.makeFrontiers(PNE, 1);
		PDO.makeFrontiers(PGR, 1);
		PDO.makeFrontiers(KOL, 1);
		PDO.makeFrontiers(KLA, 1);
		
		//FRONTEIRAS DE KINGDOM LASTWATCH
		KLA.makeFrontiers(PGR, 1);
		KLA.makeFrontiers(PDO, 1);
		KLA.makeFrontiers(GDS, 1);
		KLA.makeFrontiers(KOL, 1);
		
		//FRONTEIRAS DE GRAND DUCHY OF SMALIA
		GDS.makeFrontiers(KLA, 1);
		GDS.makeFrontiers(KOL, 1);
		
		//FRONTEIRAS DE KINGDOM OF OLDCALIA
		KOL.makeFrontiers(KLE, 1);
		KOL.makeFrontiers(PDO, 1);
		KOL.makeFrontiers(KLA, 1);
		KOL.makeFrontiers(GDS, 1);
		KOL.makeFrontiers(DEF, 1);
		KOL.makeFrontiers(ALE, 1);
		KOL.makeFrontiers(KKA, 1);
		
		//FRONTEIRAS DE DEFALSIA
		DEF.makeFrontiers(KOL, 1);
		DEF.makeFrontiers(ALE, 1);
		
		//FRONTEIRAS DE KINGDOM OF KALB
		KKA.makeFrontiers(KOL, 1);
		KKA.makeFrontiers(ALE, 1);
		KKA.makeFrontiers(VEM, 1);
		
		//FRONTEIRAS DE AYAMAR LEAGUE
		ALE.makeFrontiers(KOL, 1);
		ALE.makeFrontiers(DEF, 1);
		ALE.makeFrontiers(KKA, 1);
		ALE.makeFrontiers(VEM, 1);
		ALE.makeFrontiers(CSU, 1);
		ALE.makeFrontiers(BUN, 1);
		ALE.makeFrontiers(NAR, 1);
		ALE.makeFrontiers(PKR, 1);
		
		//FRONTEIRAS DE VUNESEEMPIRE
		VEM.makeFrontiers(KKA, 1);
		VEM.makeFrontiers(ALE, 1);
		VEM.makeFrontiers(CSU, 1);
		
		//FRONTEIRAS DE CHANDIR SULTANATE
		CSU.makeFrontiers(VEM, 1);
		CSU.makeFrontiers(ALE, 1);
		CSU.makeFrontiers(BUN, 1);
		CSU.makeFrontiers(PKS, 1);
		
		//FRONTEIRAS DE PRINCIPALITY OF KASYA
		PKS.makeFrontiers(CSU, 1);
		
		//FRONTEIRAS DE BUN
		BUN.makeFrontiers(NAR, 1);
		BUN.makeFrontiers(ALE, 1);
		BUN.makeFrontiers(CSU, 1);
		
		//FRONTEIRAS DE PRINCIPALITY OF KARHORA
		PKR.makeFrontiers(NAR, 1);
		PKR.makeFrontiers(ALE, 1);
		
		//FRONTEIRAS DE NARGUMUN
		NAR.makeFrontiers(ALE, 1);
		NAR.makeFrontiers(BUN, 1);
		NAR.makeFrontiers(PKR, 1);
		
		initiatePlay(UBU,10);
		
		
	}
	
	

	public static void initiatePlay(Kingdom initialLoc, int initialMoney) {
		Kingdom currentLoc = initialLoc;
		int Money = initialMoney;
		
		System.out.println("loc atual " + currentLoc.getNameK());
		System.out.println("dinheiro atual " + Money);
		List<Frontier> frontiers = currentLoc.frontiers;
		for (int i = 0; i < frontiers.size();i++) {
			Frontier frontier = frontiers.get(i);
			System.out.print((i+1) + ".Reino " + frontier.destination.getNameK() + "(custo: " + frontier.getCost() +")");
		}
		
		
	}
	
}
