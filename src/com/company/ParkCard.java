package com.company;

public class ParkCard extends Card {
    public ParkCard(int number){
        super.houseNumber = number;
        super.featureUsed = false;
    }

    @Override
    public void useFeature(Player player) {
        System.out.println("Playing a park card...");
    }

    @Override
    public boolean checkIfPlayableByPlayer(Player player) {
        return super.checkIfPlayableByPlayer(player);
    }
}
