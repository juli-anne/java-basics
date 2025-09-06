package com.julianne.functional_interfaces;

// functional programming - a style that applies pure functions to an input set to produce an output
// functional interface - interface with a single abstract method which can be implemented by lambda expressions and method references

import java.util.Objects;

public interface Consumer<T> {

    void accept(T t);

    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}

// interfaces
// 1. Consumer - accepts a single input argument and returns no result (void accept T t)
// 2. Supplier - accepts no arguments and returns a result (T get())
// 3. Predicate - accepts one argument and returns a boolean result (boolean test(T t))
// 4. Function - accepts one argument and returns a result (R apply(T t))
// 5. UnaryOperator - accepts one argument and returns a result of the same type
// 6. BinaryOperator - accepts two arguments of the same type and returns a result of the same type (T apply (T t, T u))
