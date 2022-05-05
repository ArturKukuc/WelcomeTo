package com.company;

public class SwimmingPoolCard extends Card {
    SwimmingPoolCard(int number){
        super.houseNumber = number;
        super.featureUsed = false; /*Warunek przyznania punktu*/

    }
    @Override
    public void useFeature(Player player) {
        System.out.println("Wywołanie funkcji zagrania karty basenu");
    }

    @Override
    public boolean checkIfPlayableByPlayer(Player player) {
        System.out.println("Wywołanie sprawdzenia możliwosci zagrania karty basenu");
        return false;
    }

}
