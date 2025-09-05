package com.julianne.abstraction;

// must implement the abstract methods from the parent OR label yourself as abstract
// write abstract here if ex. you need to implement 5/10 methods, you don't need the others now
public class Rectangle extends Shape {

    public double length;
    public double width;

    // all args constructor
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return width * length;
    }
}
