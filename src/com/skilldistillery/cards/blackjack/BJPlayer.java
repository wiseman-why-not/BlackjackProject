package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class BJPlayer {

	// fields
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

	
	
	
	
	
	
	
	
	
	
	// i dont think i need any of this.

//	public void addCard(Card card) {
//		cards.add(card);
//	}
//
//	public void clearHand() {
//
//	}
//
//
//	public int getHandValue() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//	public void getHand() {
//		System.out.println(cards);
//	}

}
