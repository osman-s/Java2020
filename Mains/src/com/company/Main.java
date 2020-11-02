package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        char myChar = 'D';
        char myUnicode = '\u0044';
        char myUnicode2 = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myUnicode2);
        boolean trues = true;

        String myString = "This is a string";
        System.out.println(myString + ", Why?");
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("Not an alien");
        }
        boolean numz = (myChar == 'd') ? true : false;
        System.out.println(numz);
        Calcu("yoko", 23);

        System.out.println(EqualSumChecker.hasEqualSum(1,1,2));


    }

    public static void Calcu(String name, int numss) {
        System.out.println("Hello " + name + " you are " + numss + " years old.");
    }

}
