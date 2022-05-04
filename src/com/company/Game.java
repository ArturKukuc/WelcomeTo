package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private int playersNumber;
    private final Card[] cardStack;
    private Player[] playersArray;



    public Game(int playersNumber){

        List<Integer> numbersShuffledList = new ArrayList<>(CardNumbers.quantitiesOfCards);
        Collections.shuffle(numbersShuffledList);
        List<CardTypes> cardtypesShuffledList = new ArrayList<>(CardTypes.typesOfCards);
        Collections.shuffle(cardtypesShuffledList);
        generateCards(numbersShuffledList,cardtypesShuffledList);

        this.playersNumber = playersNumber;
        playersArray = new Player[playersNumber];
        CardsFactory cardsFactory = new CardsFactory();

      //  cardStack = cardsFactory.generateCards();
    }

    public boolean generateCards(List<Integer> numbersShuffledList, List<CardTypes> cardtypesShuffledList){


        return cardStack = new Card[100](); //zastanów się jak stworzyc talię za pomocą list i przemianować na array
    }

    public boolean validateEqualQuantityOfCardTypesAndNumbers(){
        if(CardTypes.sum() != CardNumbers.sum()){
            System.out.println("Validation failed - sums are different"); //throw new (NumbersAndTypesNotEqualException)
            return false;
        }
        return true;
    }


   // public void GenerateCards();
   // public void DrawCards();
    //public void GenerateQuests();
}
