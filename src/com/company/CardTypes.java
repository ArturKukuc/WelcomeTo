package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum CardTypes {
    POOLS(9), WORKERSCARD(9), BISCARDSNUMBER(9), PARKSCARD(18), INVESTCARD(18), FENCECARD(18);

    CardTypes(int quantity) {
        this.quantity = quantity;
    }

    private final int quantity;

    private static int numberOfCardsInDeck;
    public static final List<CardTypes> cardtypesPoolShuffled = new ArrayList<>();

    static {
        System.out.println("Adding in progress....");
        for (CardTypes cardType : values()){
            for (int i = 0; i < cardType.quantity; i++)
                cardtypesPoolShuffled.add(cardType);
        }
        Collections.shuffle(cardtypesPoolShuffled);
        numberOfCardsInDeck = cardtypesPoolShuffled.size();
        System.out.println("There are " + numberOfCardsInDeck + " card types in deck");
    }

    public static void printAvailableCardTypes(){
        System.out.println(Arrays.toString(cardtypesPoolShuffled.toArray()));
    }

    public static int getNumberOfCardsInDeck(){
        return numberOfCardsInDeck;
    }
}
