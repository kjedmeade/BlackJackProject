package com.skilldistillery.common.cards;

import java.util.Scanner;

public class BlackJackTable {
	Dealer dealer = new Dealer();
	Player player = new Player();
	

	public void launch() {
		Scanner sc = new Scanner(System.in);
		boolean keepGoing3 = true;
		while (keepGoing3) {
			System.out.println("Welcome to BlackJack");
			System.out.println("You will be playing against the dealer");
			System.out.println("You will be dealt two cards, and the Dealer will be dealt two cards");
			System.out.println("");
			dealer.dealerShuffleCards();
			dealer.dealCardToPlayerFaceUp(player);
			System.out.println("");
			dealer.dealCardToDealerFaceDown();
			System.out.println("");
			dealer.dealCardToPlayerFaceUp(player);
			System.out.println("");
			player.getPlayerHand().isBust();
			dealer.dealCardToDealerFaceUp();
			System.out.println("");
			boolean keepGoing2 = true;
			boolean keepGoing = true;
			boolean keepGoing4 = true;
			while (keepGoing) {
				System.out.println("");
				System.out.println("hit or stand");
				String input = sc.nextLine();
				System.out.println("The dealer's first card was:");
				dealer.dealerShowFirstCard();
				System.out.println("");
				if (input.equals("hit")) {
					System.out.println("DealerHand" + dealer.getDealerHand().toString());
					System.out.println("Dealer Hand Total: " + dealer.getDealerHand().getHandValue());
					System.out.println("");
					dealer.dealCardToPlayerFaceUp(player);
					System.out.println("");
					if (player.getPlayerHand().isBust()) {
						System.out.println("You Bust, Dealer Wins");
						keepGoing = false;
					}
//				if (player.getPlayerHand().isBlackJack()) {
//					System.out.println("BLACKJACK, You Win");
//					keepGoing = false;
//				}

				}

				if (input.equals("stand")) {
					while (keepGoing4) {
						while (keepGoing2) {
							System.out.println("");
							System.out.println("DealerHand" + dealer.getDealerHand().toString());
							System.out.println("Dealer Hand Total: " + dealer.getDealerHand().getHandValue());
							System.out.println("");
							dealer.dealCardToDealerFaceUp();
							System.out.println("");
							if (dealer.getDealerHand().isBust()) {
								System.out.println("Dealer Busts, You win");
								keepGoing2 = false;
								keepGoing4 = false;
								keepGoing=false;
								break;
							}

//					if (dealer.getDealerHand().isBlackJack() {
//						System.out.println("BLACKJACK, Dealer Wins");
//						keepGoing2=false;
//						keepGoing=false;
//						break;
//					}
							if (dealer.getDealerHand().getHandValue() < 17) {
								continue;
							} else {
								keepGoing2 = false;
								break;
							}
						}
						if (keepGoing4) {
							if ((player.getPlayerHand().getHandValue()) > dealer.getDealerHand().getHandValue()) {
								System.out.println("Player wins");
								keepGoing4= false;
								keepGoing=false;
								break;
							}
							if ((player.getPlayerHand().getHandValue()) < dealer.getDealerHand().getHandValue()) {
								System.out.println("Dealer wins");
								keepGoing4= false;
								keepGoing=false;
								break;

							}

						}
					}
				}

			}
			
			System.out.println("Would you like to play again: yes or no:");
			String ans = null;
			ans = sc.nextLine();
			if (ans.equals("yes")) {
			player= new Player();
			dealer =new Dealer();
				continue;
			}
			if (ans.equals("no")) {
				System.out.println("Goodbye");
				keepGoing3 = false;
				break;
			}

		}
	}

}
