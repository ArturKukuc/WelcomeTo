package com.company;

public class BisCard extends Card {
    public BisCard(int number){
        super.houseNumber = number;
        super.featureUsed = false;
    }

    @Override
    public void useFeature(Player player) {
        System.out.println("Playing a bis card...");
    }

    @Override
    public boolean checkIfPlayableByPlayer(Player player) {
        return super.checkIfPlayableByPlayer(player);
    }
}
