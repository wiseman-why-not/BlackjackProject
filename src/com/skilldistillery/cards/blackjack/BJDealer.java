package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BJDealer extends BJPlayer {

	// fields
	BlackJackHand dealerHand = new BlackJackHand();

	private Deck dealerDeck;

	// constructor
	public BJDealer() {
		dealerDeck = new Deck();
	}

	public void dealCardToDealer(Card card) {
		dealerHand.addCard(card);
	}

	public void dealCardToPlayer(BJPlayer p) {
		p.addCardFromDealer(dealerDeck.dealCard());
	}

	public void clearHand() {

	}

	public void showDealerFullHand() {
		System.out.println("Dealer has the:\n" + dealerHand.toString());
	}

	public void showDealerSecondCard() {
		System.out.println("dealer's second card is a ");
		for (int i = 0; i < dealerHand.getCards().size(); i++) {
			if (i == 0) {
				// do nothing
			} else {
				System.out.println(dealerHand.getCards().get(i));
			}
		}
	}

	public BlackJackHand getDealerHand() {
		return dealerHand;
	}

	public Deck getDeck() {
		return dealerDeck;
	}

}
