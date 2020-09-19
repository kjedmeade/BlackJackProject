package com.skilldistillery.common.cards;

public class Dealer {
	private Deck deck = new Deck();
	private BlackJackHand dealerHand;

	public Dealer() {
		this.dealerHand = new BlackJackHand();

	}

	public void dealCardToDealerFaceDown() {
		dealerHand.addCard(deck.dealCard());
		System.out.println("The Dealer has been dealt a card face down");
	}

	public void dealCardToDealerFaceUp() {
		Card c = deck.dealCard();
		System.out.println("The Dealer has been dealt the following card");
		this.dealerHand.showCard(c);
		dealerHand.addCard(c);
		
	}
	
	public void dealerShowFirstCard() {
		dealerHand.showFirstCard();
	}

	public void dealCardToPlayerFaceUp(Player player) {
		Card c = deck.dealCard();
		player.getPlayerHand().addCard(c);
		System.out.println(player.getPlayerHand());
		System.out.println("Total Value of Your Hand:" + player.getPlayerHand().getHandValue());
	}

	public BlackJackHand getDealerHand() {
		return dealerHand;
	}

	public void setDealerHand(BlackJackHand dealerHand) {
		this.dealerHand = dealerHand;
	}
public void dealerShuffleCards() {
		deck.shuffle();
}


}
