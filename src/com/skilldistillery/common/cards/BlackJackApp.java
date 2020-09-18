package com.skilldistillery.common.cards;

public class BlackJackApp {
	public BlackJackTable bjt= new BlackJackTable();
	
	
	public static void main(String[] args) {
	BlackJackApp bja= new BlackJackApp();
	bja.run();
	}
	 
	public void run() {
		bjt.launch();
		
	}
	
}


