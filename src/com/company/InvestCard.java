package com.company;

public class InvestCard extends Card {
    public InvestCard(int number){
        super.houseNumber = number;
        super.featureUsed = false;
    }

    @Override
    public void useFeature(Player player) {
        System.out.println("Playing an invest card...");
    }

    @Override
    public boolean checkIfPlayableByPlayer(Player player) {
        return super.checkIfPlayableByPlayer(player);
    }
}
