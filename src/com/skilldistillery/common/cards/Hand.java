package com.skilldistillery.common.cards;

import java.util.ArrayList;

public abstract class Hand {
	protected ArrayList<Card> cards;
	
	
public Hand() {
	cards = new ArrayList<Card>();
}

public void addCard(Card c) {
	cards.add(c);
}

public void clear() {
	cards= new ArrayList<Card>();
}

public abstract int getHandValue();

@Override
public String toString() {
	return "You have these cards in your hand =" + cards;
}


	

}
