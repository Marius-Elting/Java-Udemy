package dev.lpa;

public class Main {

    public static void main(String... args) {
        System.out.println("Hello world again");
        // creates an array out of the Array and will splitet every space
        String[] splitStrings = "Hello world again".split(" ");

        printText(splitStrings);
        printText("splitStrings", "abc", "acs");
    }

    public static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}