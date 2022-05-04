package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardsFactory {

    public CardsFactory(){

    }

    public static Card getCard(CardTypes type, int number){
        Card card = null;
        if(number < 0 || number > GameConstants.MAXCARDNUMBER.value()){
            System.out.println("Card number is invalid");
            return card;
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
                System.out.println("Wrong card type"); //throw new IllegalArgumentException("Unknown card type.");
                return card;
        }
    }

  /* public List<Card> generateCards(){
        List<Card> generatedCards = new ArrayList<>();


   }*/
}
