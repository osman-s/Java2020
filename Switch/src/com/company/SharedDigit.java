package com.company;

public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int min, int max) {
        if (min < 10 || min > 99) {
            return false;
        } else if (max < 10 || max > 99) {
            return false;
        }

        int left = 0;
        int right = 0;
        int max_copy = max;

        while (min > 0) {
            left = min % 10;
            System.out.println("Left: " + left);
            while (max > 0) {
                right = max % 10;
                System.out.println("Right: " + right);
                if (left == right) {
                    return true;
                }
                max /= 10;
            }
            max = max_copy;
            min /= 10;
        }
        return false;
    }
}