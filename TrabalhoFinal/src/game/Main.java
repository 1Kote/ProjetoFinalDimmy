package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// CRIANDO OS REINOS
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

		// CRIANDO MISSIÕES
		Mission mission1 = new Mission(DEF, PKS, 6, 3, 1, "Viaje para PRINCIPALITY OF KASYA", false);
		Mission mission2 = new Mission(KKA, GDS, 4, 2, 2, "Viaje para GRAND DUCHY OF SMALIA", false);
		Mission mission3 = new Mission(VEM, UBU, 1, 10, -4, "VIAJE PARA UBUD", false);

		// CRIANDO LISTA DE MISSÕES
		List<Mission> missions;
		missions = new ArrayList<Mission>();
		missions.add(mission1);
		missions.add(mission2);
		missions.add(mission3);

		// FRONTEIRAS DE UBUD
		UBU.makeFrontiers(KLE, 1, 2);
		UBU.makeFrontiers(PNE, 1, 1);

		// FRONTEIRAS DE KINGDOM OF LEGEND
		KLE.makeFrontiers(UBU, 1, 0);
		KLE.makeFrontiers(PNE, 1, 1);
		KLE.makeFrontiers(PGR, 1, 5);
		KLE.makeFrontiers(PDO, 1, 3);
		KLE.makeFrontiers(KOL, 1, 4);

		// FRONTEIRAS DE PRINCIPALITY OF NEKIKA
		PNE.makeFrontiers(UBU, 1, 0);
		PNE.makeFrontiers(KLE, 1, 2);
		PNE.makeFrontiers(PGR, 1, 5);
		PNE.makeFrontiers(PDO, 1, 3);

		// FRONTEIRAS DE PRINCIPALITY OF GRITESTAR
		PGR.makeFrontiers(PNE, 1, 1);
		PGR.makeFrontiers(KLE, 1, 2);
		PGR.makeFrontiers(PDO, 1, 3);
		PGR.makeFrontiers(KLA, 1, -2);

		// FRONTEIRAS DE PROTECTORATE OF DOGROVE
		PDO.makeFrontiers(KLE, 1, 2);
		PDO.makeFrontiers(PNE, 1, 1);
		PDO.makeFrontiers(PGR, 1, 5);
		PDO.makeFrontiers(KOL, 1, 4);
		PDO.makeFrontiers(KLA, 1, -2);

		// FRONTEIRAS DE KINGDOM OF LASTWATCH
		KLA.makeFrontiers(PGR, 1, 5);
		KLA.makeFrontiers(PDO, 1, 3);
		KLA.makeFrontiers(GDS, 1, 1);
		KLA.makeFrontiers(KOL, 1, 4);

		// FRONTEIRAS DE GRAND DUCHY OF SMALIA
		GDS.makeFrontiers(KLA, 1, -2);
		GDS.makeFrontiers(KOL, 1, 4);

		// FRONTEIRAS DE KINGDOM OF OLDCALIA
		KOL.makeFrontiers(KLE, 1, 2);
		KOL.makeFrontiers(PDO, 1, 3);
		KOL.makeFrontiers(KLA, 1, -2);
		KOL.makeFrontiers(GDS, 1, 1);
		KOL.makeFrontiers(DEF, 1, -3);
		KOL.makeFrontiers(ALE, 1, 1);
		KOL.makeFrontiers(KKA, 1, 2);

		// FRONTEIRAS DE DEFALSIA
		DEF.makeFrontiers(KOL, 1, 4);
		DEF.makeFrontiers(ALE, 1, 1);

		// FRONTEIRAS DE KINGDOM OF KALB
		KKA.makeFrontiers(KOL, 1, 4);
		KKA.makeFrontiers(ALE, 1, 1);
		KKA.makeFrontiers(VEM, 1, 0);

		// FRONTEIRAS DE AYAMAR LEAGUE
		ALE.makeFrontiers(KOL, 1, 4);
		ALE.makeFrontiers(DEF, 1, -3);
		ALE.makeFrontiers(KKA, 1, 2);
		ALE.makeFrontiers(VEM, 1, 0);
		ALE.makeFrontiers(CSU, 1, 1);
		ALE.makeFrontiers(BUN, 1, 5);
		ALE.makeFrontiers(NAR, 1, 0);
		ALE.makeFrontiers(PKR, 1, -2);

		// FRONTEIRAS DE VUNESE EMPIRE
		VEM.makeFrontiers(KKA, 1, 2);
		VEM.makeFrontiers(ALE, 1, 1);
		VEM.makeFrontiers(CSU, 1, 1);

		// FRONTEIRAS DE CHANDIR SULTANATE
		CSU.makeFrontiers(VEM, 1, 0);
		CSU.makeFrontiers(ALE, 1, 1);
		CSU.makeFrontiers(BUN, 1, 5);
		CSU.makeFrontiers(PKS, 1, -7);

		// FRONTEIRAS DE PRINCIPALITY OF KASYA
		PKS.makeFrontiers(CSU, 1, 1);

		// FRONTEIRAS DE BUN
		BUN.makeFrontiers(NAR, 1, 0);
		BUN.makeFrontiers(ALE, 1, 1);
		BUN.makeFrontiers(CSU, 1, 1);

		// FRONTEIRAS DE PRINCIPALITY OF KARHORA
		PKR.makeFrontiers(NAR, 1, 0);
		PKR.makeFrontiers(ALE, 1, 1);

		// FRONTEIRAS DE NARGUMUN
		NAR.makeFrontiers(ALE, 1, 1);
		NAR.makeFrontiers(BUN, 1, 5);
		NAR.makeFrontiers(PKR, 1, -2);

		gamePlay(UBU, 3, 0, 7, missions, NAR);

	}

	public static void gamePlay(Kingdom initialLoc, int initialCoins, int initialPowerGem, int initialPowerLimit,
			@SuppressWarnings("rawtypes") List gameMissions, Kingdom gameFinalLoc) {

		Kingdom currentLoc = initialLoc; // CRIANDO UM VERTICE DO TIPO KINGDOM PARA PERCORRER O MAPA
		Kingdom finalLoc = gameFinalLoc; // LOCALIZAÇÃO FINAL PARA A POSSIBILIDADE DE ZERAR O JOGO
		Kingdom pastLoc = null; // LOCALIZAÇÃO ANTERIOR
		int coins = initialCoins; // CRIANDO UMA VARIAVEL PARA MANIPULAÇÃO DAS MOEDAS
		int powerGem = initialPowerGem; // CRIANDO UMA VARIAVEL PARA MANIPULAÇÃO DO PODER DA JOIA
		int powerLimit = initialPowerLimit; // CRIANDO UMA VARIAVEL PARA MANIPULÇÃO DO LIMIAR DE PODER
		@SuppressWarnings("unchecked")
		List<Mission> missions = gameMissions; // CRIANDO UMA VARIAVEL PARA MANIPULAR A LISTA DE MISSÕES
		boolean inMission = false; // VARIAVEL DO TIPO BOOLEAN PARA TESTAR SE HÁ UMA MISSÃO EM ANDAMENTO
		Mission mission1 = missions.get(0); // VARIAVEL PARA RECEBER ATRIBUTOS DA MISSÃO 1
		Mission mission2 = missions.get(1);// VARIAVEL PARA RECEBER ATRIBUTOS DA MISSÃO 2
		Mission mission3 = missions.get(2); // VARIAVEL PARA RECEBER ATRIBUTOS DA MISSÃO 3

		Scanner scn = new Scanner(System.in); // CRIAÇÃO DE UM SCANER PARA LER VSRIAVEIS DE ESCOLHA DENTRO DO JOGO

		System.out.println("Missões disponiveis:"); // PRINT PARA MOSTRAR MISSÕES DISPONIVEIS
		for (int i = 0; i < missions.size(); i++) {
			Mission mission = missions.get(i);
			System.out.println(
					(i + 1) + ".Localização: " + mission.missionOrigin.getNameK() + " Missâo: " + mission.description);
		}
		System.out.println(" ");

		while (true) {
			System.out.println("-------CHAOS GEM-------");

			// IF CASO O PODER DA JOIA EXEDA SEU LIMITE
			if (powerGem > powerLimit) {
				System.out.println("O poder da joia exedeu o seu limite, você morreu");
				System.out.println("FIM DE JOGO");
				break;
			}

			if (currentLoc == finalLoc) {
				if (coins < 4) {
					System.out.println("Você chegou em " + currentLoc.getNameK());
					System.out.print("Você é o servo de " + currentLoc.getNameK());
					break;
				}
				if ((coins >= 4) && (coins < 10)) {
					System.out.println("Você chegou em " + currentLoc.getNameK());
					System.out.print("Você é o lorde de " + currentLoc.getNameK());
					break;

				}
				if (coins >= 10) {
					System.out.println("Você chegou em " + currentLoc.getNameK());
					System.out.print("Você é o rei de " + currentLoc.getNameK());
					break;
				}

			}

			// PRINT DA LOCALIZAÇÃO ATUAL
			System.out.println("Localização atual: " + currentLoc.getNameK());
			// PRINT DO TOTAL DE MOEDAS
			System.out.println("Total de moedas: " + coins);
			// PRINT DO PODER DA JOIA E SEU LIMIAR
			System.out.println("Poder da joia: " + powerGem + "/" + powerLimit);
			if (inMission == true) {
				// PRINT PARA MOSTRAR SE HÁ UMA MUSSÃO EM ANDAMENTO
				System.out.println("Missão em andamento: SIM");
			}
			if (inMission == false) {
				// PRINT PARA MOSTRAR SE HÁ UMA MUSSÃO EM ANDAMENTO
				System.out.println("Missão em andamento: NÂO");
			}

			// IF PARA PERGUNTAR SE O JOGADOR DESEJA CANCELAR A MISSÃO EM PROGRESSO
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

			// MISSÃO 1
			// TESTE PARA RELACIONAR A LOC ATUAL COM A LOC DA MISSÃO
			if ((currentLoc == mission1.missionOrigin)) {
				// TESTE SE A MISSÃO JÁ FOI CONCLUIDA
				if (mission1.isComplete == false) {
					// TESTE PARA SABER SE HÁ UMA MISSÃO EM ANDAMENTO PARA APARECER A OPÇÃO DE
					// CANCELAMENTO
					if (inMission == true) {
						System.out.println("Há uma missão disponivel nesta localização");
						System.out.println("Deseja cancelar a missão atual?");
						System.out.println("(1- SIM | 2-NÃO)");
						int cancelMission = scn.nextInt();// LEITURA DA OPÇÃO DE CANCELAMENTO
						if (cancelMission == 1) {// MISSÃO EM ANDAMENTO CANCELADA
							System.out.println("Missão cancelada");
							inMission = false;
							System.out.println("Deseja realizar a missão desse reino?");
							System.out.println("Deseja realiza-la?");
							System.out.println("(1- SIM | 2-NÃO)");
							int choiceMission = scn.nextInt();// LEITURA DA VARIAVELDE ESCOLHA
							if (choiceMission == 1) {// MISSÃO ACEITA
								if (currentLoc.isHasBeen() == true) {// SE NÃO É A PRIMEIRA VEZ QUE ESTÁ PASSANDO PELO
																		// REINO
									System.out.println("Missão aceita!");
									inMission = true;
								}
								if (currentLoc.isHasBeen() == false) {// SE É A PRIMEIRA VEZ QUE ESTÁ PASSANDO PELO
																		// REINO

									System.out.println("Missão aceita!");
									inMission = true;
									System.out.println("Premio por aceitar: " + mission1.aceptReward + " Moedas");
									coins += mission1.aceptReward;
								}
							}
							// MISSÃO RECUSADA
							else if (choiceMission == 2) {
								System.out.println("Missão recusada");
							} else {
								System.out.println("Comando invalido");
							}

						}
					}
					// NÃO TEM MISSÃO EM ANDAMENTO
					if (inMission == false) {
						System.out.println("Há uma missão disponivel nesta localização");
						System.out.println("Deseja realiza-la?");
						System.out.println("(1- SIM | 2-NÃO)");
						// LEITURA DA VARIAVEL DE ESCOLHA
						int choiceMission = scn.nextInt();
						// ACEITOU A MISSÃO
						if (choiceMission == 1) {
							// SE NÃO É A PRIMEIRA VEZ QUE ESTÁ PASSANDO PELO REINO
							if (currentLoc.isHasBeen() == true) {
								System.out.println("Missão aceita!");
								inMission = true;
							}
							// SE É A PRIMEIRA VEZ QUE ESTÁ PASSANDO PELO REINO
							if (currentLoc.isHasBeen() == false) {
								System.out.println("Missão aceita!");
								inMission = true;
								System.out.println("Premio por aceitar: " + mission1.aceptReward + " Moedas");
								coins += mission1.aceptReward;
							}
						}
						// MISSÃO RECUSADA
						if (choiceMission == 2) {
							System.out.println("Missão recusada");
						}
					}
				}
			}

			// TESTE SE LOC ATUAL É A IGUAL A LOC DO DESTINO DA MISSÃO
			if (currentLoc == mission1.missionDest) {
				// SE A MISSÃO ESTÁ EM ANDAMENTO
				if (inMission == true) {
					// SE A MISSÃO JÁ FOI CONCLUIDA
					if (mission1.isComplete == false) {
						System.out.println("Você chegou em " + currentLoc.getNameK());
						System.out.println("Premio: + " + mission1.coinReward + " Moedas" + " + " + mission1.powerReward
								+ " Limite de Poder");
						coins += mission1.coinReward;
						powerLimit += mission1.powerReward;
						inMission = false;
						mission1.isComplete = true;
					}
					if (mission1.isComplete == true) {
						System.out.println(" ");
					}
				}
				// SE NÃO ESTÁ EM MISSÃO
				if (inMission == false) {
					System.out.println(" ");
				}

			}

			// OBSERVAÇÃO: PADRÃO A CIMA SEGUE PARA AS DEMAIS MISSÕES

			// MISSÃO 2
			if ((currentLoc == mission2.missionOrigin)) {
				if (mission2.isComplete == false) {
					if (inMission == true) {
						System.out.println("Há uma missão disponivel nesta localização");
						System.out.println("Deseja cancelar a missão atual?");
						System.out.println("(1- SIM | 2-NÃO)");
						int cancelMission = scn.nextInt();
						if (cancelMission == 1) {
							System.out.println("Missão cancelada");
							inMission = false;
							System.out.println("Deseja realizar a missão desse reino?");
							System.out.println("Deseja realiza-la?");
							System.out.println("(1- SIM | 2-NÃO)");
							int choiceMission = scn.nextInt();
							if (choiceMission == 1) {
								if (currentLoc.isHasBeen() == true) {
									System.out.println("Missão aceita!");
									inMission = true;
								}
								if (currentLoc.isHasBeen() == false) {

									System.out.println("Missão aceita!");
									inMission = true;
									System.out.println("Premio por aceitar: " + mission2.aceptReward + " Moedas");
									coins += mission2.aceptReward;
								}
							}
							if (choiceMission == 2) {
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
							if (currentLoc.isHasBeen() == true) {
								System.out.println("Missão aceita!");
								inMission = true;
							}
							if (currentLoc.isHasBeen() == false) {

								System.out.println("Missão aceita!");
								inMission = true;
								System.out.println("Premio por aceitar: " + mission2.aceptReward + " Moedas");
								coins += mission2.aceptReward;
							}
						}
						if (choiceMission == 2) {
							System.out.println("Missão recusada");
						}
					}
				}
			}

			if (currentLoc == mission2.missionDest) {
				if (inMission == true) {
					if (mission2.isComplete == false) {
						System.out.println("Você chegou em " + currentLoc.getNameK());
						System.out.println("Premio: + " + mission2.coinReward + " Moedas" + " + " + mission2.powerReward
								+ " Limite de Poder");
						coins += mission2.coinReward;
						powerLimit += mission2.powerReward;
						inMission = false;
						mission2.isComplete = true;
					}
					if (mission2.isComplete == true) {
						System.out.println(" ");
					}
				}
				if (inMission == false) {
					System.out.println(" ");
				}

			}

			// MISSÃO 3
			if ((currentLoc == mission3.missionOrigin)) {
				if (mission3.isComplete == false) {
					if (inMission == true) {
						System.out.println("Há uma missão disponivel nesta localização");
						System.out.println("Deseja cancelar a missão atual?");
						System.out.println("(1- SIM | 2-NÃO)");
						int cancelMission = scn.nextInt();
						if (cancelMission == 1) {
							System.out.println("Missão cancelada");
							inMission = false;
							System.out.println("Deseja realizar a missão desse reino?");
							System.out.println("Deseja realiza-la?");
							System.out.println("(1- SIM | 2-NÃO)");
							int choiceMission = scn.nextInt();
							if (choiceMission == 1) {
								if (currentLoc.isHasBeen() == true) {
									System.out.println("Missão aceita!");
									inMission = true;
								}
								if (currentLoc.isHasBeen() == false) {

									System.out.println("Missão aceita!");
									inMission = true;
									System.out.println("Premio por aceitar: " + mission3.aceptReward + " Moedas");
									coins += mission3.aceptReward;
								}

							}
							if (choiceMission == 2) {
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
							if (currentLoc.isHasBeen() == true) {
								System.out.println("Missão aceita!");
								inMission = true;
							}
							if (currentLoc.isHasBeen() == false) {

								System.out.println("Missão aceita!");
								inMission = true;
								System.out.println("Premio por aceitar: " + mission3.aceptReward + " Moedas");
								coins += mission3.aceptReward;
							}
						}
						if (choiceMission == 2) {
							System.out.println("Missão recusada");
						}
					}
				}
			}

			if (currentLoc == mission3.missionDest) {
				if (inMission == true) {
					if (mission3.isComplete == false) {
						System.out.println("Você chegou em " + currentLoc.getNameK());
						System.out.println("Premio: + " + mission3.coinReward + " Moedas" + " + " + mission3.powerReward
								+ " Limite de Poder");
						coins += mission3.coinReward;
						powerLimit += mission3.powerReward;
						inMission = false;
						mission3.isComplete = true;
					}
					if (mission3.isComplete == true) {
						System.out.println(" ");
					}
				}
				if (inMission == false) {
					System.out.println(" ");
				}

			}

			// MERCADOR
			if (currentLoc == initialLoc) {
				System.out.println(" ");
			}

			if (currentLoc != initialLoc) {

				System.out.println("MERCADOR: Olá, quantas Moedas você possui?");
				int input = scn.nextInt();

				if (input != coins) {
					System.out.println(
							"MERCADOR: O mercador também é um mago estudioso da clarividencia e sabe que você está mentindo!");
					System.out.println("MERCADOR: Mentiroso! Você possui " + coins + " moedas!");
				} else if (input == coins) {
					System.out.println("MERCADOR: Agradeço pela sinceridade!");
				}

				List<Frontier> frontiers = currentLoc.frontiers;
				System.out.println("MERCADOR: De onde você vem e para onde você vai?");
				System.out.println("MAXWELL: Eu venho de " + pastLoc.getNameK() + " e vou para:");
				System.out.println("Selecione um destino para ir:");
				for (int i = 0; i < frontiers.size(); i++) {
					Frontier frontier = frontiers.get(i);
					System.out.println((i + 1) + ".Reino: " + frontier.destination.getNameK() + "(custo: "
							+ frontier.getCost() + ") " + "(Poder ganho/perdido: " + frontier.powerGem + ")");

				}
				// SCANNER PARA LER A ESCOLHA DO JOGADOR
				int choiceMerchant = scn.nextInt();
				// VARÁVEL DO TIPO FRONTEIRAS PARA ACESSAR A LISTA DAS FRONTEIRAS DO REINO ATUAL
				Frontier choicedMerchant = frontiers.get(choiceMerchant - 1);
				// DISTÂNCIA BASEADA NO PESO DA ARESTA
				int range = choicedMerchant.powerGem;

				// PRIMEIRO FLUXO DE DECISÃO
				if ((coins < 5) && (range < 3)) {
					System.out.println("MERCADOR: Você deseja trocar moedas por limiar de joia?");
					System.out.println("Digite 1 para SIM ou digite 2 para NÃO");
					int answer = scn.nextInt();

					// CASO A RESPOSTA FOR SIM
					if (answer == 1) {
						System.out.println("MERCADOR: Você perdeu 1 moeda e ganhou 1 de limiar.");
						coins -= 1; // O JOGADOR PERDE 1 MOEDA
						powerLimit += 1; // O JOGADOR GANHA 1 DE LIMIAR
						// CASO A RESPOSTA FOR NÃO
					} else if (answer == 2) {
						System.out.println("MERCADOR: Você perdeu 1 moeda.");
						coins -= 1; // JOGADOR PERDE 1 MOEDA
					} else {
						System.out.println("Comando inválido");
					}

				}

				// SEGUNDO FLUXO DE DECISÃO
				if ((coins < 5) && (range >= 3)) {
					System.out.println("MERCADOR: Você deseja trocar moedas por limiar de joia?");
					System.out.println("Digite 1 para SIM ou digite 2 para NÃO");
					int answer = scn.nextInt();

					// CASO A RESPOSTA FOR SIM
					if (answer == 1) {
						System.out.println("MERCADOR: Você perdeu 1 moeda e ganhou 2 de limiar.");
						coins -= 1; // O JOGADOR PERDE 1 MOEDA
						powerLimit += 2; // O JOGADOR GANHA 2 DE LIMIAR
						// CASO A RESPOSTA FOR NÃO
					} else if (answer == 2) {
						System.out.println("MERCADOR: Você ganhou 2 moedas.");
						coins += 2; // JOGADOR GANHA 2
					}
				}

				// TERCEIRO FLUXO DE DECISÃO
				if ((coins >= 5) && (range < 3)) {
					System.out.println("MERCADOR: Você deseja trocar moedas por limiar de joia?");
					System.out.println("Digite 1 para SIM ou digite 2 para NÃO");
					int answer = scn.nextInt();

					// CASO A RESPOSTA FOR SIM
					if (answer == 1) {
						System.out.println("MERCADOR: Você perdeu 3 moedas e ganhou 2 de limiar.");
						coins -= 3; // O JOGADOR PERDE 3 MOEDAS
						powerLimit += 2; // O JOGADOR GANHA 2 DE LIMIAR
						// CASO A RESPOSTA FOR NÃO
					} else if (answer == 2) {
						System.out.println("MERCADOR: Você perdeu 2 moedas.");
						coins -= 2; // O JOGADOR PERDE 2 MOEDAS
					}
				}

				// QUARTO FLUXO DE DECISÃO
				if ((coins >= 5) && (range >= 3)) {
					System.out.println("MERCADOR: Você deseja trocar moedas por limiar de joia?");
					System.out.println("Digite 1 para SIM ou digite 2 para NÃO");
					int answer = scn.nextInt();

					// CASO A RESPOSTA FOR SIM
					if (answer == 1) {
						System.out.println("MERCADOR: Você perdeu 1 moeda e ganhou 3 de limiar.");
						coins -= 1; // O JOGADOR PERDE 1 MOEDA
						powerLimit += 3; // O JOGADOR GANHA 3 DE LIMIAR
						// CASO A RESPOSTA FOR NÃO
					} else if (answer == 2) {
						System.out.println("MERCADOR: Você perdeu 3 moedas.");
						coins -= 3; // O JOGADOR PERDE 3 MOEDAS
					}
				}

			}

			// FIM DE JOGO CASO NÃO HAJA MOEDAS O SUFICIENTE PARA VIAJAR
			if (coins <= 0) {
				System.out.println("Você não tem moedas o suficiente para viajar");
				System.out.println("FIM DE JOGO");
				break;
			}

			// MÉTODO DE VIAGEM
			List<Frontier> frontiers = currentLoc.frontiers;
			System.out.println("Escolha uma cidade para viajar:");
			for (int i = 0; i < frontiers.size(); i++) {
				Frontier frontier = frontiers.get(i);
				System.out.println((i + 1) + ".Reino: " + frontier.destination.getNameK() + "(custo: "
						+ frontier.getCost() + ") " + "(Poder ganho/perdido: " + frontier.powerGem + ")");

			}
			int choice = scn.nextInt();

			Frontier choicedKingdom = frontiers.get(choice - 1);
			pastLoc = currentLoc;
			powerGem += choicedKingdom.powerGem;
			coins -= choicedKingdom.getCost();
			currentLoc.setHasBeen(true);
			currentLoc = choicedKingdom.destination;
			System.out.println("VIAJANDO PARA: " + currentLoc.getNameK());

			// TESTE PARA COLOCAR O PODER DA JOIA IGUAL A 0 QUANDO A MESMA INDICAR MENOR QUE
			// 0
			if (powerGem < 0) {
				powerGem = 0;
			}

		}

	}
}