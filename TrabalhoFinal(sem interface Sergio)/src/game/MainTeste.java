package game;

import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner;


public class MainTeste {
	
	

	public static void main(String[] args) {
		
		//CRIANDO OS REINOS
		Kingdom UBU = new Kingdom("UBUD", false);
		Kingdom KLE = new Kingdom("KINGDOM OF LEGEND", false);
		Kingdom PNE = new Kingdom("PRINDIPALITY OF NEKIKA", false);
		Kingdom PGR = new Kingdom("PRINCIPALITY OF GRITESTAR", false);
		Kingdom PDO = new Kingdom("PROTECTORATE OF DOGROVE", false);
		Kingdom KLA = new Kingdom("KINGDOM OF LASTWACTH", false);
		Kingdom GDS = new Kingdom("GRAND DUCHY OF SMALIA", false);
		Kingdom KOL = new Kingdom("KINGDOM OF OLDACIA", false);
		Kingdom DEF = new Kingdom("DEFALSIA", false);
		Kingdom KKA = new Kingdom("KINGDOM OF KALB", false);
		Kingdom ALE = new Kingdom("AYAMAR LEAGUE", false);
		Kingdom PKR = new Kingdom("PRINCIPALITY OF KARHORA", false);
		Kingdom VEM = new Kingdom("VUNESE EMPIRE", false);
		Kingdom CSU = new Kingdom("CHANDIR SULTANATE", false);
		Kingdom PKS = new Kingdom("PRINCIPALITY OF KASYA", false);
		Kingdom BUN = new Kingdom("BUN", false);
		Kingdom NAR = new Kingdom("NARGUMUN", false);
		
		//CRIANDO MISSIÕES
		Mission mission1 = new Mission(DEF, PKS, 6, 3, 1, "Viaje para PRINCIPALITY OF KASYA", false);
		Mission mission2 = new Mission (KKA, GDS, 4, 2, 2, "Viaje para GRAND DUCHY OF SMALIA", false);
		Mission mission3 = new Mission(VEM, UBU, 1, 10, -4, "VIAJE PARA UBUD", false);
		
		//CRIANDO LISTA DE MISSÕES
		List<Mission> missions;
		missions = new ArrayList<Mission>();
		missions.add(mission1);
		missions.add(mission2);
		missions.add(mission3);
		
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
		
		initiatePlay(UBU,3, 0, 7, missions, true);
		
	}
	

	@SuppressWarnings({ "unused", "resource" })
	public static void initiatePlay(Kingdom initialLoc, int initialCoins, int initialPowerGem, int initialPowerLimit, List gameMissions, boolean talked) {
		
		Kingdom currentLoc = initialLoc;
		int coins = initialCoins;  
		int powerGem = initialPowerGem;
		int powerLimit = initialPowerLimit;
		boolean talk = talked;
		List<Mission> missions = gameMissions;
		boolean inMission = false;
		Mission mission1 = missions.get(0);
		Mission mission2 = missions.get(1);
		Mission mission3 = missions.get(2);
		mission1.isComplete = false;
		mission2.isComplete = false;
		mission3.isComplete = false;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Missões disponiveis:");
		for (int i = 0; i<missions.size(); i++) {
			Mission mission = missions.get(i);
			System.out.println((i+1)+ ".Localização: "+mission.missionOrigin.getNameK() + " Missâo: " + mission.description);
		}
		
		Game:
		while (true) {
			
		if(currentLoc.getNameK() == initialLoc.getNameK()) {	
			System.out.println("loc atual " + currentLoc.getNameK());
			System.out.println("dinheiro atual " + coins);
			System.out.println("Poder da joia: " + powerGem + "/" + powerLimit );
			System.out.println("Missão em andamento: " + inMission);
			
			if (inMission == true) {
				System.out.println("Deseja cancelar a missão atual?");
				System.out.println("(1- SIM | 2-NÃO)");
				int cancelMission = scn.nextInt();
				if (cancelMission == 1) {
					System.out.println("Missão Cancelada");
					inMission = false;
				}
				if (cancelMission == 2) {
					System.out.println(" ");
				}
				
			}
			
			//MISSÃO 1
			if((currentLoc == mission1.missionOrigin)) {
				if (mission1.isComplete == false) {
					if (inMission == true) {
						System.out.println("Há uma missão disponivel nesta localização");
						System.out.println("Deseja cancelar a missão atual?");
						System.out.println("(1- SIM | 2-NÃO)");
						int cancelMission = scn.nextInt();
						if (cancelMission == 1) {
							System.out.println("Missão cancelada");
							System.out.println("Deseja realizar a missão desse reino?");
							System.out.println("Deseja realiza-la?");
							System.out.println("(1- SIM | 2-NÃO)");
							int choiceMission = scn.nextInt();
							if (choiceMission == 1) {
								if (currentLoc.isJaPassou() == true) {
									System.out.println("Missão aceita!");
									inMission = true;
								}
								if (currentLoc.isJaPassou()== false) {

									System.out.println("Missão aceita!");
									inMission = true;
									System.out.println("Premio por aceitar: "+ mission1.aceptReward + " Moedas");
									coins += mission1.aceptReward;
								}
							}
							if(choiceMission == 2) {
								System.out.println("Missão recusada");
							}
						}
					}
					if (inMission == false) {
					System.out.println("Há uma missão disponivel nesta localização");
					System.out.println("Deseja realiza-la?");
					System.out.println("(1- SIM | 2-NÃO)");
					int choiceMission = scn.nextInt();
					if (choiceMission == 1) {
						if (currentLoc.isJaPassou() == true) {
							System.out.println("Missão aceita!");
							inMission = true;
						}
						if (currentLoc.isJaPassou()== false) {
							System.out.println("Missão aceita!");
							inMission = true;
							System.out.println("Premio por aceitar: "+ mission1.aceptReward + " Moedas");
							coins += mission1.aceptReward;
						}
						}
					if (choiceMission == 2) {
						System.out.println("Missão recusada");
						}
					}
				}
			}
			
			if(currentLoc == mission1.missionDest) {
				if (inMission == true) {
					if (mission1.isComplete == false) {
						System.out.println("Você chegou em "+ currentLoc.getNameK());
						System.out.println("Premio: + " + mission1.coinReward + " Moedas" + " + " + mission1.powerReward + "Limite de Poder");
						coins += mission1.coinReward;
						powerLimit += mission1.powerReward;
						inMission = false;
						mission1.isComplete = true;
					}
					if(mission1.isComplete == true) {
						System.out.println(" ");
					}
				}
				if (inMission == false) {
					System.out.println(" ");
				}
				
			}
			
			//MISSÃO 2
			if((currentLoc == mission2.missionOrigin)) {
				if (mission2.isComplete == false) {
					if (inMission == true) {
						System.out.println("Há uma missão disponivel nesta localização");
						System.out.println("Deseja cancelar a missão atual?");
						System.out.println("(1- SIM | 2-NÃO)");
						int cancelMission = scn.nextInt();
						if (cancelMission == 1) {
							System.out.println("Missão cancelada");
							System.out.println("Deseja realizar a missão desse reino?");
							System.out.println("Deseja realiza-la?");
							System.out.println("(1- SIM | 2-NÃO)");
							int choiceMission = scn.nextInt();
							if (choiceMission == 1) {
								if (currentLoc.isJaPassou() == true) {
									System.out.println("Missão aceita!");
									inMission = true;
								}
								if (currentLoc.isJaPassou()== false) {

									System.out.println("Missão aceita!");
									inMission = true;
									System.out.println("Premio por aceitar: "+ mission2.aceptReward + " Moedas");
									coins += mission2.aceptReward;
								}
							}
							if(choiceMission == 2) {
								System.out.println("Missão recusada");
							}
						}
					}
					if (inMission == false) {
					System.out.println("Há uma missão disponivel nesta localização");
					System.out.println("Deseja realiza-la?");
					System.out.println("(1- SIM | 2-NÃO)");
					int choiceMission = scn.nextInt();
					if (choiceMission == 1) {
						if (currentLoc.isJaPassou() == true) {
							System.out.println("Missão aceita!");
							inMission = true;
						}
						if (currentLoc.isJaPassou()== false) {

							System.out.println("Missão aceita!");
							inMission = true;
							System.out.println("Premio por aceitar: "+ mission2.aceptReward + " Moedas");
							coins += mission2.aceptReward;
						}
						}
					if (choiceMission == 2) {
						System.out.println("Missão recusada");
						}
					}
				}
			}
			
			if(currentLoc == mission2.missionDest) {
				if (inMission == true) {
					if (mission2.isComplete == false) {
						System.out.println("Você chegou em "+ currentLoc.getNameK());
						System.out.println("Premio: + " + mission2.coinReward + " Moedas" + " + " + mission2.powerReward + "Limite de Poder");
						coins += mission2.coinReward;
						powerLimit += mission2.powerReward;
						inMission = false;
						mission2.isComplete = true;
					}
					if(mission2.isComplete == true) {
						System.out.println(" ");
					}
				}
				if (inMission == false) {
					System.out.println(" ");
				}
				
			}
			
			//MISSÃO 3
			if((currentLoc == mission3.missionOrigin)) {
				if (mission3.isComplete == false) {
					if (inMission == true) {
						System.out.println("Há uma missão disponivel nesta localização");
						System.out.println("Deseja cancelar a missão atual?");
						System.out.println("(1- SIM | 2-NÃO)");
						int cancelMission = scn.nextInt();
						if (cancelMission == 1) {
							System.out.println("Missão cancelada");
							System.out.println("Deseja realizar a missão desse reino?");
							System.out.println("Deseja realiza-la?");
							System.out.println("(1- SIM | 2-NÃO)");
							int choiceMission = scn.nextInt();
							if (choiceMission == 1) {
								if (currentLoc.isJaPassou() == true) {
									System.out.println("Missão aceita!");
									inMission = true;
								}
								if (currentLoc.isJaPassou()== false) {

									System.out.println("Missão aceita!");
									inMission = true;
									System.out.println("Premio por aceitar: "+ mission3.aceptReward + " Moedas");
									coins += mission3.aceptReward;
								}
							}
							if(choiceMission == 2) {
								System.out.println("Missão recusada");
							}
						}
					}
					if (inMission == false) {
					System.out.println("Há uma missão disponivel nesta localização");
					System.out.println("Deseja realiza-la?");
					System.out.println("(1- SIM | 2-NÃO)");
					int choiceMission = scn.nextInt();
					if (choiceMission == 1) {
						if (currentLoc.isJaPassou() == true) {
							System.out.println("Missão aceita!");
							inMission = true;
						}
						if (currentLoc.isJaPassou()== false) {

							System.out.println("Missão aceita!");
							inMission = true;
							System.out.println("Premio por aceitar: "+ mission3.aceptReward + " Moedas");
							coins += mission3.aceptReward;
						}
						}
					if (choiceMission == 2) {
						System.out.println("Missão recusada");
						}
					}
				}
			}
			
			if(currentLoc == mission3.missionDest) {
				if (inMission == true) {
					if (mission3.isComplete == false) {
						System.out.println("Você chegou em "+ currentLoc.getNameK());
						System.out.println("Premio: + " + mission3.coinReward + " Moedas" + " + " + mission3.powerReward + "Limite de Poder");
						coins += mission3.coinReward;
						powerLimit += mission3.powerReward;
						inMission = false;
						mission3.isComplete = true;
					}
					if(mission3.isComplete == true) {
						System.out.println(" ");
					}
				}
				if (inMission == false) {
					System.out.println(" ");
				}
				
			}
			
			//MERCADOR
			
			
			
			
			
			
			//MÉTODO DE VIAGEM
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
			currentLoc.setJaPassou(true);
			currentLoc = choicedKingdom.destination;		
			System.out.println("VIAJANDO PARA: " + currentLoc.getNameK());
			
			if(powerGem < 0) {
				powerGem = 0;
			}
			
		}
		else if(currentLoc.getNameK() != initialLoc.getNameK()) {	
			System.out.println("loc atual " + currentLoc.getNameK());
			System.out.println("dinheiro atual " + coins);
			System.out.println("Poder da joia: " + powerGem + "/" + powerLimit );
			System.out.println("Missão em andamento: " + inMission);
			
			if (inMission == true) {
				System.out.println("Deseja cancelar a missão atual?");
				System.out.println("(1- SIM | 2-NÃO)");
				int cancelMission = scn.nextInt();
				if (cancelMission == 1) {
					System.out.println("Missão Cancelada");
					inMission = false;
				}
				if (cancelMission == 2) {
					System.out.println(" ");
				}
				
			}
			
			//MISSÃO 1
			if((currentLoc == mission1.missionOrigin)) {
				if (mission1.isComplete == false) {
					if (inMission == true) {
						System.out.println("Há uma missão disponivel nesta localização");
						System.out.println("Deseja cancelar a missão atual?");
						System.out.println("(1- SIM | 2-NÃO)");
						int cancelMission = scn.nextInt();
						if (cancelMission == 1) {
							System.out.println("Missão cancelada");
							System.out.println("Deseja realizar a missão desse reino?");
							System.out.println("Deseja realiza-la?");
							System.out.println("(1- SIM | 2-NÃO)");
							int choiceMission = scn.nextInt();
							if (choiceMission == 1) {
								if (currentLoc.isJaPassou() == true) {
									System.out.println("Missão aceita!");
									inMission = true;
								}
								if (currentLoc.isJaPassou()== false) {

									System.out.println("Missão aceita!");
									inMission = true;
									System.out.println("Premio por aceitar: "+ mission1.aceptReward + " Moedas");
									coins += mission1.aceptReward;
								}
							}
							if(choiceMission == 2) {
								System.out.println("Missão recusada");
							}
						}
					}
					if (inMission == false) {
					System.out.println("Há uma missão disponivel nesta localização");
					System.out.println("Deseja realiza-la?");
					System.out.println("(1- SIM | 2-NÃO)");
					int choiceMission = scn.nextInt();
					if (choiceMission == 1) {
						if (currentLoc.isJaPassou() == true) {
							System.out.println("Missão aceita!");
							inMission = true;
						}
						if (currentLoc.isJaPassou()== false) {
							System.out.println("Missão aceita!");
							inMission = true;
							System.out.println("Premio por aceitar: "+ mission1.aceptReward + " Moedas");
							coins += mission1.aceptReward;
						}
						}
					if (choiceMission == 2) {
						System.out.println("Missão recusada");
						}
					}
				}
			}
			
			if(currentLoc == mission1.missionDest) {
				if (inMission == true) {
					if (mission1.isComplete == false) {
						System.out.println("Você chegou em "+ currentLoc.getNameK());
						System.out.println("Premio: + " + mission1.coinReward + " Moedas" + " + " + mission1.powerReward + "Limite de Poder");
						coins += mission1.coinReward;
						powerLimit += mission1.powerReward;
						inMission = false;
						mission1.isComplete = true;
					}
					if(mission1.isComplete == true) {
						System.out.println(" ");
					}
				}
				if (inMission == false) {
					System.out.println(" ");
				}
				
			}
			
			//MISSÃO 2
			if((currentLoc == mission2.missionOrigin)) {
				if (mission2.isComplete == false) {
					if (inMission == true) {
						System.out.println("Há uma missão disponivel nesta localização");
						System.out.println("Deseja cancelar a missão atual?");
						System.out.println("(1- SIM | 2-NÃO)");
						int cancelMission = scn.nextInt();
						if (cancelMission == 1) {
							System.out.println("Missão cancelada");
							System.out.println("Deseja realizar a missão desse reino?");
							System.out.println("Deseja realiza-la?");
							System.out.println("(1- SIM | 2-NÃO)");
							int choiceMission = scn.nextInt();
							if (choiceMission == 1) {
								if (currentLoc.isJaPassou() == true) {
									System.out.println("Missão aceita!");
									inMission = true;
								}
								if (currentLoc.isJaPassou()== false) {

									System.out.println("Missão aceita!");
									inMission = true;
									System.out.println("Premio por aceitar: "+ mission2.aceptReward + " Moedas");
									coins += mission2.aceptReward;
								}
							}
							if(choiceMission == 2) {
								System.out.println("Missão recusada");
							}
						}
					}
					if (inMission == false) {
					System.out.println("Há uma missão disponivel nesta localização");
					System.out.println("Deseja realiza-la?");
					System.out.println("(1- SIM | 2-NÃO)");
					int choiceMission = scn.nextInt();
					if (choiceMission == 1) {
						if (currentLoc.isJaPassou() == true) {
							System.out.println("Missão aceita!");
							inMission = true;
						}
						if (currentLoc.isJaPassou()== false) {

							System.out.println("Missão aceita!");
							inMission = true;
							System.out.println("Premio por aceitar: "+ mission2.aceptReward + " Moedas");
							coins += mission2.aceptReward;
						}
						}
					if (choiceMission == 2) {
						System.out.println("Missão recusada");
						}
					}
				}
			}
			
			if(currentLoc == mission2.missionDest) {
				if (inMission == true) {
					if (mission2.isComplete == false) {
						System.out.println("Você chegou em "+ currentLoc.getNameK());
						System.out.println("Premio: + " + mission2.coinReward + " Moedas" + " + " + mission2.powerReward + "Limite de Poder");
						coins += mission2.coinReward;
						powerLimit += mission2.powerReward;
						inMission = false;
						mission2.isComplete = true;
					}
					if(mission2.isComplete == true) {
						System.out.println(" ");
					}
				}
				if (inMission == false) {
					System.out.println(" ");
				}
				
			}
			
			//MISSÃO 3
			if((currentLoc == mission3.missionOrigin)) {
				if (mission3.isComplete == false) {
					if (inMission == true) {
						System.out.println("Há uma missão disponivel nesta localização");
						System.out.println("Deseja cancelar a missão atual?");
						System.out.println("(1- SIM | 2-NÃO)");
						int cancelMission = scn.nextInt();
						if (cancelMission == 1) {
							System.out.println("Missão cancelada");
							System.out.println("Deseja realizar a missão desse reino?");
							System.out.println("Deseja realiza-la?");
							System.out.println("(1- SIM | 2-NÃO)");
							int choiceMission = scn.nextInt();
							if (choiceMission == 1) {
								if (currentLoc.isJaPassou() == true) {
									System.out.println("Missão aceita!");
									inMission = true;
								}
								if (currentLoc.isJaPassou()== false) {

									System.out.println("Missão aceita!");
									inMission = true;
									System.out.println("Premio por aceitar: "+ mission3.aceptReward + " Moedas");
									coins += mission3.aceptReward;
								}
							}
							if(choiceMission == 2) {
								System.out.println("Missão recusada");
							}
						}
					}
					if (inMission == false) {
					System.out.println("Há uma missão disponivel nesta localização");
					System.out.println("Deseja realiza-la?");
					System.out.println("(1- SIM | 2-NÃO)");
					int choiceMission = scn.nextInt();
					if (choiceMission == 1) {
						if (currentLoc.isJaPassou() == true) {
							System.out.println("Missão aceita!");
							inMission = true;
						}
						if (currentLoc.isJaPassou()== false) {

							System.out.println("Missão aceita!");
							inMission = true;
							System.out.println("Premio por aceitar: "+ mission3.aceptReward + " Moedas");
							coins += mission3.aceptReward;
						}
						}
					if (choiceMission == 2) {
						System.out.println("Missão recusada");
						}
					}
				}
			}
			
			if(currentLoc == mission3.missionDest) {
				if (inMission == true) {
					if (mission3.isComplete == false) {
						System.out.println("Você chegou em "+ currentLoc.getNameK());
						System.out.println("Premio: + " + mission3.coinReward + " Moedas" + " + " + mission3.powerReward + "Limite de Poder");
						coins += mission3.coinReward;
						powerLimit += mission3.powerReward;
						inMission = false;
						mission3.isComplete = true;
					}
					if(mission3.isComplete == true) {
						System.out.println(" ");
					}
				}
				if (inMission == false) {
					System.out.println(" ");
				}
				
			}
			
			//MERCADOR
			System.out.println("Ola, quantas Moedas vc possui?");
			int input = scn.nextInt();
			
			if(input != coins) 
			{
				System.out.println("O mercador tamb�m � um mago estudioso da clarividencia e sabe que voc� est� mentindo!");
				System.out.println("Mentiroso! Voc� possui " + coins + " moedas!");
				
			}
			else if(input == coins) 
			{
				System.out.println("Agrade�o pela sinceridade!");
			}
			
			
			
			
			
			//MÉTODO DE VIAGEM
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
			currentLoc.setJaPassou(true);
			currentLoc = choicedKingdom.destination;		
			System.out.println("VIAJANDO PARA: " + currentLoc.getNameK());
			
			if(powerGem < 0) {
				powerGem = 0;
			}
			
		}
		
		}
				
	}
}
