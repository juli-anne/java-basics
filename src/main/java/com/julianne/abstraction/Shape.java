package com.julianne.abstraction;

// abstraction is something that exists in theory but doesn't have a concrete existence
// shape is abstract, types of shapes are concrete
// use this when you want to define a template of a class or method, but you don't intend it to be used as is,
// - you want someone else to implement that, it's just a template
// abstract classes are implemented by their subclasses, designed to be extended
// it's to abstract to define what the behavior actually would be
public abstract class Shape {

    // method that has no body, designed to be overridden buy a subclass
    // you can't calculate the area of "the shape", but can of a rectangle (child)
    abstract double calculateArea();

    // you can have methods that have a body in an abstract class
    public void printShape() {
        System.out.println("Shape");
    }
}
