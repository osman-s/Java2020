package com.company;

import java.util.Scanner;

public class InputCalculator {
    // Write your code here
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int avg = 0;
        boolean bool = true;

        while (bool) {
            bool = scanner.hasNextInt();
            if (bool) {
                sum += scanner.nextInt();
                count++;
                avg = (int) Math.round((double) sum / count);
            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
            }
        }
    }
}