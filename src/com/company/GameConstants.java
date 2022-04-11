package com.company;

public enum GameConstants {
    ESTATEMAXCAPACITY(6), QUESTSNUMBER(3), MAXPOINTSFORQUEST(14), MINPOINTSFORQUEST(8), MAXCARDNUMBER(15);
    GameConstants(int value){
        this.value = value;
    }
    private final int value;
    public int value() { return value; }
}
