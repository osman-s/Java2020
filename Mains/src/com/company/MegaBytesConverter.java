package com.company;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megabytes = (int) Math.floor(kiloBytes / 1024);
        int remaining = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megabytes +
                " MB and " + remaining + " KB");
    }
}
