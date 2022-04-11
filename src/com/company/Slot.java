package com.company;

public class Slot {
    private final boolean hasPool;
    private boolean hasLeftFence;
    private boolean hasRightFence;
    private int houseNumber;
    private Card slotTakenBy;
    private boolean usedForQuest;

    public boolean buildHouse(Card card);
    public boolean buildHouse(Card card, int Number);
    public void markAsUsedForQuest();
    public void buildFence();

}
