package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit2 = new LinkedList<String>();
        placesToVisit.add("Sidney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        // removeElement(placesToVisit);
        // System.out.println(placesToVisit);

        // gettingElements(placesToVisit);

        printItineary(placesToVisit);
        printItineary2(placesToVisit);
        printItineary3(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {

        // adds Item at the first position
        list.addFirst("Darwin");
        // adds Item at the last position
        list.addLast("Hobart");

        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        // Stack methods
        // adds Item at the first position
        list.push("Alice Springs");

    }

    private static void removeElement(LinkedList<String> list) {
        // remove by index
        list.remove(4);
        // remove by value
        list.remove("Brisbane");

        System.out.println(list);

        String s1 = list.remove(); // removes first element
        System.out.println(s1 + "Was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + "Was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + "Was removed");

        // Queue/Deque poll methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + "Was removed");
        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + "Was removed");
        String p3s = list.pollLast(); // removes last element
        System.out.println(p3s + "Was removed");

        list.push("Sidney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + "was removed");

    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("Retrieved Element = " + list.getFirst());
        System.out.println("Retrieved Element = " + list.getLast());
        System.out.println("Darwin is ad position = " + list.indexOf("Darwin"));
        System.out.println("Melbourne is ad position = " + list.indexOf("Melbourne"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());
        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek()); // gets first element
        System.out.println("Element from peekFirst() = " + list.peekFirst()); // gets first element
        System.out.println("Element from peekLast() = " + list.peekLast()); // gets last element

    }

    public static void printItineary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());

        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItineary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;

        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItineary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;

        }
        System.out.println("Trip ends at " + list.getLast());
    }
}
