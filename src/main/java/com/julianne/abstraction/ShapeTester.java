package com.julianne.abstraction;

public class ShapeTester {

    public static void main(String[] args) {

        // can't instantiate an abstract class, no new Shape, but new Child
        Shape rectangle = new Rectangle(2, 3);

        rectangle.printShape();
        System.out.println(rectangle.calculateArea());
    }
}
