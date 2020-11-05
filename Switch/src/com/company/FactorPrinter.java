package com.company;

public class FactorPrinter {
    // write your code here
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= (int) Math.round((double) number / 2); i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        if (number != 1) {
            System.out.println(number);
        }

    }
}