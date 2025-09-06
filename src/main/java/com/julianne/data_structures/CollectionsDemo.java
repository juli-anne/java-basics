package com.julianne.data_structures;

import java.util.HashSet;
import java.util.Set;

// data structures store and organize a collection of objects in a way that operations can be performed on the collections
// set - unordered collection of unique objects - no duplicates can be shown
  // ex. a deck of 52 cards (each is a unique element in the collection)
// list
// queue
// map
public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();
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
}
