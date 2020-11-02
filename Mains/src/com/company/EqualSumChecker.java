package com.company;

public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        int numc = num1 + num2;
        if (numc == num3) {
            return true;
        }
        return false;
    }
}
