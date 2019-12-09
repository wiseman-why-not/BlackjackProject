package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class BJPlayer {

	// fields

	BlackJackHand playerHand = new BlackJackHand();

	public BJPlayer() {

	}

	public void addCardFromDealer(Card card) {
		playerHand.addCard(card);

	}

	public void askForAnotherCard(Card card) {
		playerHand.addCard(card);
	}

	public boolean dontAskForAnotherCard() {
		return false;
	}

	public BlackJackHand getPlayerHand() {
		return playerHand;
	}

	public void getHand() {
		System.out.println("Player you have the:\n" + playerHand.toString());
	}

}
