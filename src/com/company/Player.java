package com.company;

import java.util.List;

public class Player {
    private String name;
    private String cityName;
    private Street shortestStreet;
    private Street mediumStreet;
    private Street longestStreet;
    private int[] questsDone;
    //private int[estateMaxCapacity] investedEstates;
    private int swimmingPoolsBuilt;
    private int swappedNumbersCounter;
    private int bisUsedCounter;
        public class Street{
            private boolean[] parks;
            //private final int length;
            private List<Slot> houses;
        }

}
