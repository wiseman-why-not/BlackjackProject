package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Deck;

public class BlackJackTable {
	BJDealer dealer = new BJDealer();
	BJPlayer player = new BJPlayer();
	Deck deck = new Deck();
	Scanner kb = new Scanner(System.in);
	
	public BlackJackTable() {
		//startDealing();
	}
	
	public void startDealing() {
		dealer.dealCardToPlayer(player);
		dealer.dealCardToDealer(dealer.getDeck().dealCard());
		dealer.dealCardToPlayer(player);
		dealer.dealCardToDealer(dealer.getDeck().dealCard());
		dealer.showDealerSecondCard();
		System.out.println();
		player.getHand();
		System.out.println("Your total is " + player.getPlayerHand().getHandValue());
		
		if( dealer.dealerHand.isBlackjack() ) {
			System.out.println("You lost, dealer has a black jack");
			System.exit(0);
		} 
		if (player.playerHand.isBlackjack() ) {
			System.out.println("You won!!!!!, black jack");
			System.exit(0);
		}
		
		boolean keepHitting = false;
		do {
			System.out.println();
			System.out.println("1. To hit \n2. To stay");
			Integer hitOrStay = kb.nextInt();
			if (hitOrStay == 1) {
				dealer.dealCardToPlayer(player);
				player.getHand();
				System.out.println("Your total is " + player.getPlayerHand().getHandValue());
				keepHitting = player.getPlayerHand().isBust();
				if(player.getPlayerHand().isBlackjack()) {
					System.out.println("you got blackjack, you won");
					System.exit(0);
				}
				if(keepHitting == false) {
					System.exit(0);
				}
			} else {
				dealer.showDealerFullHand();
				System.out.println("dealer's total " + dealer.getDealerHand().getHandValue());
				
				while(dealer.getDealerHand().getHandValue() <= 17) {
					dealer.dealCardToDealer(dealer.getDeck().dealCard());
					dealer.showDealerFullHand();
					System.out.println("dealer's total " + dealer.getDealerHand().getHandValue());
					keepHitting = dealer.getDealerHand().isBust();
				
				}
				
				keepHitting = player.dontAskForAnotherCard();
			}
		} while(keepHitting);
		
		boolean checkIfDealerBusted;
		checkIfDealerBusted = dealer.getDealerHand().isBust();
		
		if(player.getPlayerHand().getHandValue() == dealer.getDealerHand().getHandValue()) {
			System.out.println("you tied");
		} else if (player.getPlayerHand().getHandValue() > dealer.getDealerHand().getHandValue()) {
			System.out.println("you won");
		} else if (checkIfDealerBusted == true && player.getPlayerHand().getHandValue() < dealer.getDealerHand().getHandValue() ){
			System.out.println("you lost, dealer won");
		} else {
			System.out.println("you won");
		}
		
	}
	
	
}
