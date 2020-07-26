package com.company;

import java.util.Random;

public class MyRandom {
    public int getRandomInt(int min, int max) {
        Random rand       = new Random();
        int    subNumber  = max - min;
        int    randNumber = rand.nextInt(subNumber);
        return randNumber + min;
    }

//    public int getRandomInt(int max) {
//        return getRandomInt(0, max);
//    }
//
//    public int getRandomInt() {
//        return getRandomInt(0, 10);
//    }
}
