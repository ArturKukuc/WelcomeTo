package com.company;

public enum CardType {
    POOLS(9), WORKERSCARD(9), BISCARDSNUMBER(9), PARKSCARD(9), INVESTCARD(18), FENCECARD(18);

    CardType(int value) {
        this.value = value;
    }

    private final int value;
    private int numberOfCardsInDeck;
    private int sum(){
        for (CardType cardType : CardType.values()) {
            numberOfCardsInDeck += cardType.value;
        }
        System.out.println("There are " +  numberOfCardsInDeck + "cards in deck");
        return numberOfCardsInDeck;
    }
}
