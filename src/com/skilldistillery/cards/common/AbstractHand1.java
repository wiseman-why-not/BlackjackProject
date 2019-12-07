package com.skilldistillery.cards.common;

import java.util.List;

public interface AbstractHand1 {

	// fields
//	List<Card> cards;
	
	
	public void addCard(Card card);
	
	public void clearHand();
	
	abstract public int getHandValue();

	@Override
	public String toString();
}
