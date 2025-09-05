package com.julianne.inheritance;

import com.julianne.objects.Rectangle;

public class InheritanceTester {

    public static void main(String[] args) {
        // constructors in super class run before the ones in sub class
        // instantiate the person class
        // able to call to the default constructor
      //  Person person = new Person();
        // employee object
      //  Employee employee = new Employee();

        Square square = new Square();

        // set the length in square
        square.setLength(25);
        square.calculatePerimeter();

     //   System.out.println(square.calculatePerimeter());

        Rectangle rectangle = new Rectangle();
        // print what the rectangle says
        rectangle.print();
        // print what the square says, pass in value
        square.print("square");
    }
}
