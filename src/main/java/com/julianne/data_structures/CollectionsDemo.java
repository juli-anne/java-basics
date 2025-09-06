package com.julianne.data_structures;

import java.util.*;

// data structures store and organize a collection of objects in a way that operations can be performed on the collections
// set - unordered collection of unique objects - no duplicates can be shown
  // ex. a deck of 52 cards (each is a unique element in the collection)
// list - ordered elements accessible by position, has duplicates
// queue - ordered elements that are processed in the order in which they are added
  // ex. people in a line are added to the end, the processing is handled from the beginning to the end
  // type of processing - FIRST-IN-FIRST-OUT
// map
public class CollectionsDemo {

    public static void main(String[] args) {
        // setDemo();
        // listDemo();
        queueDemo();
    }

    public static void setDemo() {
        // a set of fruit
        // make the collection
        Set<String> fruits = new HashSet<>();
        // add things to the collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // print it - it's not shown in order because set is an unordered collection
        System.out.println(fruits);
        // check what's in the set
        System.out.println("Is there an orange? " + fruits.contains("Orange"));

        System.out.println();

        // remove an element
        fruits.remove("Banana");
        System.out.println("Is there a banana? " + fruits.contains("Banana"));
        System.out.println(fruits);

        System.out.println();

        // check the size
        System.out.println("Size: " + fruits.size());

        System.out.println();

        // another way of adding elements - but this set is immutable - can't be changed (add/remove)
        Set<String> moreFruit = Set.of("Pear", "Raisin", "Cherry");
        System.out.println(moreFruit);
    }

    public static void listDemo() {

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Cucumber");
        vegetables.add("Potato");
        vegetables.add("Tomato");

        // replace an element
        vegetables.set(0, "Carrot");
        // can contain duplicates
        vegetables.add("Tomato");
        // remove an element - removes the first instance
        vegetables.remove("Tomato");
        vegetables.add("Carrot");
        vegetables.remove(3);
        vegetables.add("Carrot");

        // print out what's on a specific spot
        System.out.println("Second element: " + vegetables.get(1));
        // when we don't know where the object is
        System.out.println(vegetables.indexOf("Tomato"));
        System.out.println(vegetables.lastIndexOf("Carrot"));

        System.out.println(vegetables);

        List<String> moreVegetables = List.of("Cucumber", "Potato", "Tomato");
    }

    private static void queueDemo() {

        Queue<String> checkout = new LinkedList<>();
        checkout.add("first customer");
        checkout.add("second customer");
        checkout.add("third customer");
        checkout.add("second customer"); // allows dupes

        var removed = checkout.remove(); // will remove the first in line - THE HEAD OF THE LINE
        System.out.println("Removed: " + removed);

        // check the next head of the queue
        System.out.println("Head of queue: " + checkout.peek());

        System.out.println(checkout);
    }
}
