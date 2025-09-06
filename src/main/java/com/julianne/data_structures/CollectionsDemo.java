package com.julianne.data_structures;

import java.util.*;

// data structures store and organize a collection of objects in a way that operations can be performed on the collections
// set - unordered collection of unique objects - no duplicates can be shown
  // ex. a deck of 52 cards (each is a unique element in the collection)
// list - ordered elements accessible by position, has duplicates
// queue - ordered elements that are processed in the order in which they are added
  // ex. people in a line are added to the end, the processing is handled from the beginning to the end
  // type of processing - FIRST-IN-FIRST-OUT
// map - unordered unique key-value pairs (considered a part of the collections framework even though it isn't really)
  // ex. a list of bank transaction, each has an id as a key, the value would be the transaction
public class CollectionsDemo {

    public static void main(String[] args) {
        // setDemo();
        // listDemo();
        // queueDemo();
         mapDemo();
    }

    public static void setDemo() {
        // a set of fruit
        // make the collection
        Set<String> fruits = new HashSet<>();
        // add things to the collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // iterating - with a loop of your choice
        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next()); // gets the next object
        } // iterator doesn't work on map because it's not in the collection group

        System.out.println("\n.....");

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

        // iterating with an enhanced for loop
        for(String vegetable : vegetables) {
            System.out.println(vegetable);
        }

        System.out.println("\n.....");

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

    public static void mapDemo() {

        Map<Integer, String> paymentMethods = new HashMap<>();
        paymentMethods.put(1, "Credit Card"); // use put not add
        paymentMethods.put(2, "Debit Card"); // first value is the key, second the value
        paymentMethods.put(3, "Cash");
        // use if you aren't sure if it exists
        paymentMethods.putIfAbsent(4, "Coupon Card"); // if you want to override something just use put again
        // remove by its key
        paymentMethods.remove(2);
        // value for an object
        System.out.println("Special payment methods: " + paymentMethods.get(4)); // get by the key because it's unique
        System.out.println("Contains coupons: " + paymentMethods.containsValue("Coupon Card")); // containsKey

        System.out.println(paymentMethods);

        // immutable way
        Map <Integer, String> otherPaymentMethods = Map.of(
                1, "Bank Transfer",
                2, "Keks Pay",
                3, "Apple Pay");

        System.out.println(otherPaymentMethods);

        System.out.println("\n.....");

        // iterating in a map - not the best way
        Set<Map.Entry<Integer, String>> mapEntries = paymentMethods.entrySet();
        var i = mapEntries.iterator();

        while (i.hasNext()) {
            Map.Entry<Integer, String> entry = i.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            }

        System.out.println("\n.....");
        // iterating through a map with an enhanced for loop
        for (Map.Entry<Integer, String> otherEntry : otherPaymentMethods.entrySet()) {
            System.out.println(otherEntry.getKey() +  ": " + otherEntry.getValue());
        }
    }
}
