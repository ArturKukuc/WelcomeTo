package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private int playersNumber;
    private List<Card> deck;
    private Player[] playersArray;



    public Game(int playersNumber){
        this.playersNumber = playersNumber;
        playersArray = new Player[playersNumber];
        generateCards(CardTypes.cardtypesPoolShuffled, CardNumbers.cardNumbersPoolShuffled);
    }

    public boolean generateCards(List<CardTypes> cardtypesShuffledList, List<Integer> numbersShuffledList) throws IllegalCardException {
        if(!validateEqualQuantityOfCardTypesAndNumbers()){
            return false;
        }

        List<Card> temporaryDeck = new ArrayList<>();

        for (int i = 0; i < GameConstants.MAXDECKCAPACITY.value(); i++) {
                Card card = CardsFactory.getCard(cardtypesShuffledList.get(i), numbersShuffledList.get(i));
                temporaryDeck.add(card);
        }

        deck = Collections.unmodifiableList(temporaryDeck);
        return true;
    }



    public boolean validateEqualQuantityOfCardTypesAndNumbers(){
        if((CardTypes.getNumberOfCardsInDeck() == CardNumbers.getNumberOfCardsInDeck()) && (CardTypes.getNumberOfCardsInDeck() == GameConstants.MAXDECKCAPACITY.value()))
            return true;
        else {
            System.out.println("Wrong cards quantity");
            return false;
        }
    }

    public void printDeck(){
        System.out.println(deck);
    }


   // public void GenerateCards();
   // public void DrawCards();
    //public void GenerateQuests();
}
