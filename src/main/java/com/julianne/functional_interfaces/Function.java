package com.julianne.functional_interfaces;

import java.util.Objects;

@FunctionalInterface
public interface Function<T,R> {

    R apply(T t);

    default <V> Function<T,V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }

}
