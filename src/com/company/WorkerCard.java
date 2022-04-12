package com.company;

public class WorkerCard extends Card {
    public WorkerCard(int number){
        super.houseNumber = number;
        super.featureUsed = false;
    }

    @Override
    public void useFeature(Player player) {
        System.out.println("Playing a worker card...");
    }

    @Override
    public boolean checkIfPlayableByPlayer(Player player) {
        return super.checkIfPlayableByPlayer(player);
    }
}
