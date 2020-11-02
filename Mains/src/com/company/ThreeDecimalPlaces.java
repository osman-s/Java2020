package com.company;

public class ThreeDecimalPlaces {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if ((int) (num2 * 1000d) / 1000d == (int) (num2 * 1000d) / 1000d) {
            return true;
        }
        return false;
    }
}
