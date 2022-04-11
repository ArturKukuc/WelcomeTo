package com.company;

public class CardsFactory {
    public Card getCard(CardType type, int number){
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
                System.out.println("Wrong card type");
                return card;
        }
    }
}
