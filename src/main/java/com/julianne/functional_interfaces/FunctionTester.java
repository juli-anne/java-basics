package com.julianne.functional_interfaces;

public class FunctionTester {

    public static void main(String[] args) {

        Function<Integer, Integer> square = (n) -> n * n;
        Function<Integer, Integer> add = (n) -> n + n;
        Integer result = square.andThen(add).apply(5);

        System.out.println(result);
    }
}
