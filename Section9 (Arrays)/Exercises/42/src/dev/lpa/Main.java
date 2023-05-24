package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] userInput = getIntegers(5);
        System.out.println("Returend" + Arrays.toString(userInput));
        sortIntegers(userInput);
    }

    static int[] getIntegers(int length) {

        Scanner s = new Scanner(System.in);
        int[] output = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please Enter numbers you want to sort");
            int input;
            try {
                input = Integer.parseInt(s.nextLine());
                output[i] = input;
                System.out.println(input + " has been added.");
            } catch (NumberFormatException basUserInput) {
                System.out.println("Please enter a valid number");
                i--;
            }
        }
        System.out.println(Arrays.toString(output));
        s.close();

        return output;
    }

    static int[] sortIntegers(int[] arg) {
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
        System.out.println(Arrays.toString(copiedArray));
        return copiedArray;
    }

    static void printArray(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Element " + i + " contents " + args[i]);
        }
    }
}
