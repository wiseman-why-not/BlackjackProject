package com.skilldistillery.cards.common;

import java.util.List;

public abstract class AbstractHand {
	
	// fields
	List<Card> cards;
	
	
	public AbstractHand() {
		
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clearHand() {
		cards.removeAll(cards);
	}
	
	abstract public int getHandValue();

	
	public String toString() {
		String cardsInHand = "";
		for (Card card : cards) {
			cardsInHand += card.toString() + "\n";
		}
		return cardsInHand;
	}
	
	public Card getCard(int number) {
		return cards.get(number);
	}
	
	
	
}
