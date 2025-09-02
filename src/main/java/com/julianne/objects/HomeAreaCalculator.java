package com.julianne.objects;

import java.util.Scanner;

public class HomeAreaCalculator {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculator calculator = new HomeAreaCalculator();
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();
        double totalArea = calculator.calculateArea(room1, room2);

        /*
        // using the first constructor
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        double areOfRoom = room1.calculateArea();

        // using the second constructor
        Rectangle room2 = new Rectangle(30, 75);
        double areOfRoom2 = room2.calculateArea();

        double totalArea = areOfRoom + areOfRoom2;
        */

        System.out.println("Total Area: " + totalArea);
    }

    public Rectangle getRoom() {
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateArea(Rectangle room1, Rectangle room2) {
        return room1.calculateArea() + room2.calculateArea();
    }
}
