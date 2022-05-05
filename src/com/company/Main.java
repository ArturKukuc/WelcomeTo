package com.company;

public class Main {

    public static void main(String[] args) {
	CardNumbers.printAvailableCardNumbers();
		System.out.println(CardNumbers.getNumberOfCardsInDeck());
	CardTypes.printAvailableCardTypes();
		System.out.println(CardTypes.getNumberOfCardsInDeck());
		System.out.println("---------------------------------------------------------------------");
	Game game = new Game(2);
	game.printDeck();
    }
}
