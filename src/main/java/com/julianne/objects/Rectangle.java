package com.julianne.objects;

public class Rectangle {

    private double width;
    protected double length;
    protected double sides = 4;

    // constructors purpose is to set up the initial state before using it
    // default constructors already exist
    // don't set this.width in constructors, best to do in methods
    public Rectangle() {
        setWidth(0);
        setLength(0);
    }

    // overloading method
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public void print() {
        System.out.println("Rectangle");
    }

    public double calculatePerimeter() {
        return (2 * length) * (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        // set the global variable equal to my local variable
        this.sides = sides;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
