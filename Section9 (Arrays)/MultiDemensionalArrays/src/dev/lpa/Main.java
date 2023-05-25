package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array1 = {
                { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 },
        };
        int[][] array2 = {
                { 1, 2, 3 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4, 5 },
        };

        int[][] array3 = new int[3][3];
        int[][] array4 = new int[3][];

        for (int[] outer : array1) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
        }

    }
}