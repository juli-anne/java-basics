package com.julianne.functional_interfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTester {

    public static void main(String[] args) {

        List<String> countries = List.of("Australia", "China", "France", "Italy");

        Consumer<String> print = System.out::println;
        // OR c -> System.out.println(c);

        countries.forEach(print);

        print.accept("Croatia");
    }
}
