package com.company;

public class PerfectNumber {
    // write your code here
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        int i = 1;
        while (i <= (int) Math.round((double) number / 2)) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        return (sum == number) ? true : false;
    }
}

