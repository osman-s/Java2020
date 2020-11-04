package com.company;

public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int first = number % 10;
        int last = first;
        number /= 10;
        System.out.println("number " + number + "; first " + first);

        while (number > 0) {
            if (number >= 10) {
                number /= 10;
            } else {
                last = number % 10;
                System.out.println("number " + number + "; Last " + last);
                break;
            }
        }
        return (first + last);
    }
}