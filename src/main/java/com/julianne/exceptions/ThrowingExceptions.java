package com.julianne.exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// throw - flag errors in your code with throwing exceptions by yourself
public class ThrowingExceptions {

    public static double calculatePay(double hours, double payRate)
            throws NegativeInputException {
                // overtime
                if (hours < 40) {
                    throw new IllegalArgumentException("Hours must be greater than or equal to 40");
                } else if (hours < 0 || payRate < 0) {
                    throw new NegativeInputException();
                }

                return payRate * hours;
    }

    // I don't want to handle it - I'm throwing it too
    public static void rethrowException() throws IOException {
        File file = new File("nonexistent.txt");
        file.createNewFile();
    }

    // polymorphic throws statement
    public static void rethrowExceptions() throws IOException {
        File file = new File("nonexistent.txt");
        file.createNewFile();
        Scanner fileReader = new Scanner(file);
    }
}
