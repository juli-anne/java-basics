package com.julianne.inheritance;

import com.julianne.objects.Rectangle;

public class Square extends Rectangle {

    // changing the Rectangle's method
    @Override
    public double calculatePerimeter() {
        // sides and length were private so this doesn't work, change in protected
        return sides * length;
        // OR return getSides() * getLength;
    }

    // overloading method
    public void print(String what) {
        System.out.println(what);
    }
}
