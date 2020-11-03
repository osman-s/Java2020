package com.company;

public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit;

        if (summer) {
            upperLimit = 45;
        } else {
            upperLimit = 35;
        }
        if (temperature >= 25 && temperature <= upperLimit) {
            return true;
        } else {
            return false;
        }
    }
}