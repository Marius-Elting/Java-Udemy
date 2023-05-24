package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // creates a new Array every Array Element will be i
        // you cant change the number of array Elements after creating the Array
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;
        // default value of undefined elements is 0
        System.out.println(myIntArray[0]);
        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        // default value of undefined elements is 0
        System.out.println(myDoubleArray[0]);

        int[] myDefinedIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arrayLength = myDefinedIntArray.length;
        System.out.println(arrayLength);
        System.out.println(myDefinedIntArray[arrayLength - 1]);

        // alternativ way
        int[] myDefinedIntArray2 = new int[] { 1, 2, 3, 4, 5, 6 };
        myDefinedIntArray2[0] = 2;

        // the following is not possible because you can not use Array initialzer
        // outside of an declaration
        // int[] newArray;
        // newArray = {1,2,3,};

        int[] newArray;
        newArray = new int[] { 5, 4, 3, 2, 1, };

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        int[] newArray2 = new int[5];

        for (int i = 0; i < newArray2.length; i++) {
            newArray2[i] = newArray2.length - i;
        }

        for (int i = 0; i < newArray2.length; i++) {
            System.out.print(newArray2[i] + " ");
        }

        System.out.println();
        // loops over every element in the Array, like the forEach in Javascript or the
        // for in / for of
        for (int element : newArray2) {
            System.out.print(element + " ");
        }

        System.out.println();

        // outputs the whole Array formatted
        System.out.println(Arrays.toString(newArray2));

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;

    }
}
