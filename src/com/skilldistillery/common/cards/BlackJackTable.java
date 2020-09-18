package com.skilldistillery.common.cards;

import java.util.Scanner;

public class BlackJackTable {
	Dealer dealer = new Dealer();
	Player player = new Player();

	public void launch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to BlackJack");
		System.out.println("You will be playing against the dealer");
		System.out.println("You will be dealt two cards, and the Dealer will be dealt two cards");
		System.out.println("");

		dealer.dealCardToPlayerFaceUp(player);
		System.out.println("");
		dealer.dealCardToDealerFaceDown();
		System.out.println("");
		dealer.dealCardToPlayerFaceUp(player);
		System.out.println("");
		player.getPlayerHand().isBust();
		dealer.dealCardToDealerFaceUp();
		System.out.println("");
		dealer.getDealerHand();

		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("");
			System.out.println("hit or keep");
			String input = sc.nextLine();
			System.out.println("The dealer's first card was:");
			dealer.dealerShowFirstCard();
			System.out.println("");
			if (input.equals("hit")) {
				dealer.dealCardToPlayerFaceUp(player);
				System.out.println("");
				System.out.println("DealerHand" + dealer.getDealerHand().toString() );
				System.out.println("");
				if (player.getPlayerHand().isBust()) {
					keepGoing = false;
				}
				System.out.println("");
				dealer.dealCardToDealerFaceUp();
				System.out.println("Dealer Hand Total: "+ dealer.getDealerHand().getHandValue());
				if (dealer.getDealerHand().isBust()) {
					keepGoing = false;
				}

			}

			if (input.equals("keep")) {
				dealer.dealerShowFirstCard();
				System.out.println("");
				if (dealer.getDealerHand().isBust()) {
					keepGoing = false;
				}

			}

		}

	}

}
