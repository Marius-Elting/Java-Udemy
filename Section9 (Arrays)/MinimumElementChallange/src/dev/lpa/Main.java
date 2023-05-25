package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] userInput = readIntegers();
        int min = findMin(userInput);
        System.out.println(min);
    }

    public static int[] readIntegers() {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] userInput = input.split(",");

        int[] userIntArray = new int[userInput.length];
        for (int i = 0; i < userInput.length; i++) {
            userIntArray[i] = Integer.parseInt(userInput[i]);
        }
        System.out.println(Arrays.toString(userIntArray));
        s.close();
        return userIntArray;
    }

    public static int findMin(int[] arg) {
        int[] sortedArray = Arrays.copyOf(arg, arg.length);
        Arrays.sort(sortedArray);

        return sortedArray[0];
    }
}