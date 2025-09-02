package com.julianne.objects;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        // using the first constructor
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        double areOfRoom = room1.calculateArea();

        // using the second constructor
        Rectangle room2 = new Rectangle(30, 75);
        double areOfRoom2 = room2.calculateArea();

        double totalArea = areOfRoom + areOfRoom2;
        System.out.println("Total Area: " + totalArea);
    }
}
