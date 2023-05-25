package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intput = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        reverse(intput);
    }

    public static void reverse(int[] args) {
        System.out.println("Array = " + Arrays.toString(args));

        int[] unreversed = Arrays.copyOf(args, args.length);
        for (int i = 0; i < args.length; i++) {
            args[i] = unreversed[unreversed.length - 1 - i];
        }
        System.out.println("Array = " + Arrays.toString(args));
    }
}