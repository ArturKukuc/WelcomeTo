package com.company;

public class FenceCard extends Card {

    public FenceCard(int number){
        super.houseNumber = number;
        super.featureUsed = false;
    }

    @Override
    public void useFeature(Player player) {
        System.out.println("Playing a fence card...");
    }

    @Override
    public boolean checkIfPlayableByPlayer(Player player) {
        return super.checkIfPlayableByPlayer(player);
    }
}