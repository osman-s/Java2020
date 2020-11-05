package com.company;

public class GreatestCommonDivisor {
    // write your code here
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
//        int k = (int) Math.round((double)first/2);
//        System.out.println(k);
        for (int i = (int) Math.round((double) first / 2); i > 0; i--) {
            if (first % i == 0) {
                if (second % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
}