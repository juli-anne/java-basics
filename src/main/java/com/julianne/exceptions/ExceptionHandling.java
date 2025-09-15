package com.julianne.exceptions;

import java.io.File;

public class ExceptionHandling {

    public static void main(String[] args) {

        // making a file
        File file = new File("resources/nonexistant.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println("IOException: "  + e.getMessage());
//        }

        // POLYMORPHISM
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Exception: "  + e.getMessage());
        }
    }
}

// unchecked exceptions - are not checked by the compiler, they are runtime exceptions
 // used when there's not anything that can be done in the event of the error
// 1. InputMismatchException - ex. someone enters a string instead of a required integer

// checked exceptions - exceptions that are checked by the compiler
 // used when there's a possibility of recovery

// ways of handling multiple exceptions:
// 1. polymorphism
// 2. multiple catch blocks - catch after catch
// 3. catch multiple in single block - with |  and print stack trace
