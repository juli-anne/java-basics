package com.julianne.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// streams - sequence of elements from data source
// doesn't store elements as collections do
// allows you to perform operations on the data without affecting the original source
public class Stream {

    static int[] numbers = {0, 2, 4, 6, 8, 10};

    static List<String> vegetables = List.of(
            "spinach", "cabbage", "peas", "green beans", "brussels sprouts", "carrots"
    );

    public static void main(String[] args) {

        // take that data source and make a stream out of it
        // prints out the numbers +1
        // the array is still the same but the output is changed
        Arrays.stream(numbers).forEach(n -> System.out.print(n + 1 + " "));

        System.out.println("\n");
        // a couple of different operations at the same time
        Arrays.stream(numbers).parallel().forEach(n -> System.out.print(n + 1 + " "));

        System.out.println("\n");

        anyMatch();
        allMatch();
        System.out.println();
        filter();
        System.out.println();
        map();
        System.out.println();
        reduce();
        System.out.println();
        intReduce();
        System.out.println();
        collect();
        System.out.println();
        multiOperation();
    }

    public static void anyMatch() {
        boolean anyMatches = vegetables.stream().anyMatch(v -> v.contains(" "));
        System.out.println("Contains veggies with more than one word in their name: " + anyMatches);
    }

    public static void allMatch() {
        boolean allMatches = vegetables.stream().allMatch(v -> v.contains(" "));
        System.out.println("Contains only veggies with single word names: " + allMatches);
    }

    public static void filter() {
        System.out.println("Filtering all veggies with multiple word names: ");
        vegetables.stream()
                .filter(v -> v.contains(" "))
                .forEach(System.out::println);
    }

    public static void map() {
        vegetables.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println); // converting all elements in the stream to upper case
    }

    public static void reduce() {
        System.out.println(vegetables
                .stream()
                .sorted() // sorting before the reduce
                // reducing the whole stream in one string that is pipe deliminated
                .reduce("",(a,b) -> a + " | " + b));
    }

    public static void intReduce() {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // start at 0, given the first to elements, add the elements
        // this will sum up the whole stream because the a becomes the sum again and again
        System.out.println(numbers
                .stream()
                .reduce(0, (a, b) -> a + b));
    } // or store it in a variable and print the variable out

    // collect assigns the stream (resulting) to a collection of choice
    public static void collect() {

        List<String> vegetablesEndingWithS = vegetables
                .stream()
                .filter(v -> v.endsWith("s"))
                .collect(Collectors.toList());

        vegetablesEndingWithS.forEach(System.out::println);
    }

    public static void multiOperation() {
        vegetables.stream()
                .sorted()
                .filter(v -> v.startsWith("c"))
                .map(String::toUpperCase)
                .map(v -> v.transform(w -> "yummy " + w))
                .forEach(System.out::println);
    }
}

// stream operations
// 1. intermediate - perform operation and return resulting stream - map, reduce, collect
// 2. terminal - return a result and close the stream - anyMatch, allMatch
