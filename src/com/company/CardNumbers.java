package com.company;

import java.util.*;

public enum CardNumbers {
    ONES(1, 3), TWOS(2, 3), THREES(3, 4), FOURS(4, 5), FIVES(5, 6), SIXES(6, 7),
    SEVENS(7, 8), EIGHTS(8, 9), NINES(9, 8), TENS(10, 7), ELEVENS(11, 6), TWELVES(12, 5),
    THIRTEENS(13, 4), FOURTEENS(14, 3), FIFTEENS(15, 3);


    private final int houseNumber;
    private final int quantity;
    private static int numberOfCardsInDeck;
    public static final List<Integer> quantitiesOfCards = new ArrayList<>();

    CardNumbers(int houseNumber, int quantity) {
        this.houseNumber = houseNumber;
        this.quantity = quantity;
    }

    static {
        for (CardNumbers cardNumber : values()) {
            for (int i = 0; i < cardNumber.quantity; i++)
                quantitiesOfCards.add(cardNumber.houseNumber);
        }
    }

    public static int sum() {
        for (CardNumbers cardNumber : CardNumbers.values()) {
            numberOfCardsInDeck += cardNumber.quantity;
        }
        System.out.println("There are " + numberOfCardsInDeck + " numbers in deck");
        return numberOfCardsInDeck;
    }

    public static void printAvailableCardNumbers() {
        System.out.println(Arrays.toString(quantitiesOfCards.toArray()));
    }

}
