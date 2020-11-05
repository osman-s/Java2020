package com.company;

public class FlourPacker {
    // write your code here
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int i = 0;
        while (i != bigCount && (goal - 5 >= 0)) {
            i++;
            goal = goal - 5;
//            System.out.println("i " + i + " goal " + goal);
        }

        int j = 0;
        while (j != smallCount && (goal - 1 >= 0)) {
            j++;
            goal = goal - 1;
//            System.out.println("j " + j + " goal " + goal);
        }

        return (goal == 0);

    }
}
