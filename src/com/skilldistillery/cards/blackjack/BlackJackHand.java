package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.AbstractHand;
import com.skilldistillery.cards.common.Card;

public class BlackJackHand extends AbstractHand {

	List<Card> cardsInHand = new ArrayList<>();

	@Override
	public int getHandValue() {
		int total = 0;
		for (Card card : cardsInHand) {
			total += card.getValue();
		}
		return total;
	}

	public boolean isBlackjack() {
		if (this.getHandValue() == 21) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isBust() {
		if (this.getHandValue() > 21) {
			System.out.println("Busted");
			return false;
		} else {
			return true;
		}
	}

	public void addCard(Card card) {
		cardsInHand.add(card);
	}

	public List<Card> getCards() {
		return cardsInHand;
	}

	public String toString() {
		String str = "";
		for (Card card : cardsInHand) {
			str += card.toString() + "\n";
		}
		return str;
	}

}
