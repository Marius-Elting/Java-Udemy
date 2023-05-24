package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] intArray = getRandomArray(10);
        // sort from low to high
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        int[] secondArray = new int[10];

        System.out.print(Arrays.toString(secondArray));
        // sets every Element in the Array to five
        Arrays.fill(secondArray, 5);
        System.out.print(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        // returns void sort the original array
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        // the aditional Elements will be initialized with 0
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = { "Able", "Jane", "Mark", "Ralph", "David" };
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        // binary Search only works on sortet arrays
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the List");
        }

        int[] s1 = { 1, 2, 3, 4, 5 };
        int[] s2 = { 1, 2, 3, 4, 5 };
        // checks if two arrays are equal
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");

        }
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            // this will create an random number between 0 and 99
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
