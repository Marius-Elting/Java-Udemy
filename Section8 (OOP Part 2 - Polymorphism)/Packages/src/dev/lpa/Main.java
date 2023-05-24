package dev.lpa;

import com.abc.first.Item;
// import all classes from this Package
import com.abc.first.*;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("New ITEM");
        // use Path instead of Importing everything
        com.abc.first.Item firstItem = new com.abc.first.Item("Burger");
    }
}
