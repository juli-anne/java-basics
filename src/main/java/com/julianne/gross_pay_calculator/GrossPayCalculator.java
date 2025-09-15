package com.julianne.gross_pay_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

        System.out.println("How many hours did you work?");
        // allow user inputs
        Scanner scanner = new Scanner(System.in);
        // read the input from the command line - integer because hours
        // store it in a variable
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");
        double rate = scanner.nextDouble();

        // close the scanner when we are done with asking for inputs
        scanner.close();
        // define the calc
        double payRate = hours * rate;
        // output the calc
        System.out.println("Gross Pay: " + payRate);
    }
}