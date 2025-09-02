package com.julianne.objects;

public class Rectangle {

    private double width;
    private double length;
    private double sides = 4;

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
