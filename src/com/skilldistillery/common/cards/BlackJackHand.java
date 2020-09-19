package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand {
	private List<Card> cards;

	
public BlackJackHand() {
	this.cards= new ArrayList<Card>();
}

public void addCard(Card card) {
	this.cards.add(card);
}

public int getHandValue() {
	int totalValue=0;
	for (Card card : this.cards) {
		totalValue+= card.getValue();
	}
	return totalValue;
}

public boolean isBust() {
	int totalValue=0;
	for (Card card : this.cards) {
		totalValue+= card.getValue();
	
	}
	if (totalValue>21) {
		return true;
	}
	return false;
}

public boolean isBlackJack() {
	int totalValue=0;
	for (Card card : this.cards) {
		totalValue+= card.getValue();
	
	}
	if (totalValue==21) {
		return true;
	}
	return false;
}

public void showCard(Card c) {
	System.out.println(c.toString());	
}

public void showFirstCard() {
	System.out.println(cards.get(0));	
}

@Override
public String toString() {
	return "[" + cards + "]";
}


}

