package com.company;

public class EvenDigitSum {
    // write your code here
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            if (number / 10 >= 1) {
                if ((number % 10) % 2 == 0) {
                    sum += number % 10;
                    System.out.println(sum);
                }
                number /= 10;
            } else {
                if (number % 2 == 0) {
                    sum += number;
                    System.out.println(sum);
                }
                break;
            }
        }
        return sum;
    }
}