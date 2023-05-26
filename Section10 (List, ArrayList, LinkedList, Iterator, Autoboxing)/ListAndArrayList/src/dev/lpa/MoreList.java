package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = { "apples", "bananas", "milk", "eggs" };
        // creates an list with all items
        // list is immutable and you can not add items to it
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of(items));

        System.out.println(nextList);

        groceries.addAll(nextList);

        System.out.print(groceries);

        System.out.println("Third Item =  " + groceries.get(2));
        if (groceries.contains("milk")) {
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("first = " + groceries.lastIndexOf("yogurt"));
        System.out.println(groceries);
        // this will only remove the first it finds
        groceries.remove("yogurt");
        System.out.println(groceries);
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        // this will reduce the list to only the provided Values
        groceries.retainAll(List.of("apples", "milk", "mustart", "cheese"));
        System.out.println(groceries);

        // will clear the list
        groceries.clear();

        System.out.println(groceries);

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}
