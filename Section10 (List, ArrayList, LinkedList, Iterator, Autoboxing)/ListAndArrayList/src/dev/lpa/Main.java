package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
};

public class Main {

    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("Cheese");
        groceryArray[2] = new GroceryItem("Bacon", "MEAT", 6);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> objectList = new ArrayList<>();
        objectList.add(new GroceryItem("Butter"));
        objectList.add(new GroceryItem("yogurt"));
        // as the first argument you can define where in the list the item should e
        objectList.add(1, new GroceryItem("Skyr"));
        objectList.set(1, new GroceryItem("MILK"));
        objectList.remove(1);
        System.out.println(objectList.toString());
    }
}