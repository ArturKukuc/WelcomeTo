package com.company;

public abstract class Card {

    protected int houseNumber;
    protected boolean featureUsed;
    /*Result of card being play can affect his statistics in different way */
    public abstract void useFeature(Player player);
    /*Different card type can have different legalization rule*/
    public boolean checkIfPlayableByPlayer(Player player){
        System.out.println("To be implemented");
        return true;
    }
    public int getHouseNumber(){
        return this.houseNumber;
    }
}

