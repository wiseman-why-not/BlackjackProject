package com.skilldistillery.cards.blackjack;

public class BlackJackApp {
	
	BlackJackTable newTable = new BlackJackTable();

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.startPlaying();

	}

	private void startPlaying() {
		newTable.startDealing();

		
	}

}
