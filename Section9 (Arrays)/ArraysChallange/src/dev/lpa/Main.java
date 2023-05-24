package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] randomArray = getRandomArray(10);
        int[] sortetArray = sortInt(randomArray);
        System.out.println(Arrays.toString(sortetArray));
    }

    public static int[] sortInt(int[] arg) {
        int[] copiedArray = Arrays.copyOf(arg, arg.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < copiedArray.length - 1; i++) {
                if (copiedArray[i] < copiedArray[i + 1]) {
                    temp = copiedArray[i];
                    copiedArray[i] = copiedArray[i + 1];
                    copiedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return copiedArray;
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
