package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean active = true;
        System.out.println("Welcome to your Shopping list");
        System.out.println("0  exit");
        System.out.println("1 - add Items");
        System.out.println("2 - remove Items");
        while (active) {

            int action = Integer.parseInt(s.nextLine());

            if (action == 0) {
                active = false;
            }
            if (action == 1) {
                System.out.println("Type items to add seperated by komma");
                String input = s.nextLine();
                String[] inputArray = input.split(",");
                for (String item : inputArray) {
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                    } else {
                        shoppingList.add(item);
                        System.out.print(item + " ");
                    }
                }
                System.out.println("has been added!");

            }
            if (action == 2) {
                System.out.println("Type items to remove seperated by komma");
                String input = s.nextLine();
                String[] inputArray = input.split(",");
                for (String item : inputArray) {
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                        System.out.print(item + ", ");
                    }
                }
                System.out.println("has been removed!");
            }
        }

        System.out.println(shoppingList);
        System.out.println(shoppingList.get(0));
        s.close();
    }
}