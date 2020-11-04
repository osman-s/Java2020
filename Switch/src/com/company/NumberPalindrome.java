package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int original = number;
        int reverse = 0;

        while (number > 0) {
            if (number / 10 >= 1) {
                reverse += number % 10;
                reverse *= 10;
                number /= 10;
            } else {
                reverse += number % 10;
                break;
            }
        }
        if (reverse == original) {
            return true;
        } else {
            return false;
        }
    }
}