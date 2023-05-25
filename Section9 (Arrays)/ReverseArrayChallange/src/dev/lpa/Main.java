package dev.lpa;

import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] intput = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        reverse(intput);
    }

    public static void reverse(int[] args) {
        int[] reversed = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            reversed[i] = args[args.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}