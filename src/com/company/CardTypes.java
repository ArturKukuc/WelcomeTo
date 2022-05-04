package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CardTypes {
    POOLS(9), WORKERSCARD(9), BISCARDSNUMBER(9), PARKSCARD(18), INVESTCARD(18), FENCECARD(18);

    CardTypes(int value) {
        this.value = value;
    }

    private final int value;
    private static int numberOfCardsInDeck;
    public static final List<CardTypes> typesOfCards = new ArrayList<>();

    public static int sum(){
        for (CardTypes cardType : CardTypes.values()) {
            numberOfCardsInDeck += cardType.value;
        }
        System.out.println("There are " +  numberOfCardsInDeck + " card types in deck");
        return numberOfCardsInDeck;
    }

    static{
        for (CardTypes cardType : values()){
            for (int i = 0; i < cardType.value; i++)
                typesOfCards.add(cardType);
        }
    }

    public static void printAvailableCardTypes(){
        System.out.println(Arrays.toString(typesOfCards.toArray()));
    }

}
