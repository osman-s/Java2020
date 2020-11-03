package com.company;

public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int year = (int) minutes / (60 * 24 * 365);
        int day = ((int) minutes % (60 * 24 * 365)) / (60 * 24);

        System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }
}