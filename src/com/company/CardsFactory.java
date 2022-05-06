package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardsFactory {

    public CardsFactory(){

    }

    public static Card getCard(CardTypes type, int number) throws IllegalCardException{
        Card card = null;
        if(number < 0 || number > GameConstants.MAXCARDNUMBER.value()){
            throw new InvalidCardNumberException("House number out of playable range");
        }
        switch (type){
            case POOLS:
                return new SwimmingPoolCard(number);
            case FENCECARD:
                return new FenceCard(number);
            case PARKSCARD:
                return new ParkCard(number);
            case INVESTCARD:
                return new InvestCard(number);
            case WORKERSCARD:
                return new WorkerCard(number);
            case BISCARDSNUMBER:
                return new BisCard(number);
            default:
                throw new NonExistingCardTypeException("Card type not included in available types");
              //  System.out.println("Wrong card type"); //throw new IllegalArgumentException("Unknown card type.");
        }
    }

  /* public List<Card> generateCards(){
        List<Card> generatedCards = new ArrayList<>();


   }*/
}
