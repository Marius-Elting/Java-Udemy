package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int amount = readInteger();
        int[] userInput = readElements(amount);
        int minimum = findMin(userInput);
        System.out.println(minimum);

    }

    private static int readInteger() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = Integer.parseInt(s.nextLine());

        return userInput;
    }

    private static int[] readElements(int length) {
        Scanner s = new Scanner(System.in);

        int[] userIntArray = new int[length];
        for (int i = 0; i < length; i++) {
            int intput = Integer.parseInt(s.nextLine());
            userIntArray[i] = intput;
        }
        System.out.println(Arrays.toString(userIntArray));

        return userIntArray;
    }

    public static int findMin(int[] arg) {
        int[] sortedArray = Arrays.copyOf(arg, arg.length);
        Arrays.sort(sortedArray);

        return sortedArray[0];
    }
}