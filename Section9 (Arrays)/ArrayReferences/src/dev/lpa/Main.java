package dev.lpa;

import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        // created a new refference (2 variables wich both pointed the same array in
        // memory)
        int[] anotherArray = myIntArray;

        anotherArray[0] = 1;
        // both are the same
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        // both arrays will be changed
        modifyArra(anotherArray);
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));
    }

    private static void modifyArra(int[] array) {
        array[1] = 2;
    }
}