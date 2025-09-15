package com.julianne.mortage_calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {

    public static void main(String[] args) {

        final byte months = 12;
        final byte percent = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Invalid input. Enter a value between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            monthlyInterest = annualInterest / percent / months;
            if(annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / percent / months;
                break;
            }
            System.out.println("Invalid input. Enter a value between 1 and 30");
        }

        while (true) {
            System.out.println("Period (Years)");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * months;
                break;
            }
            System.out.println("Invalid input. Enter a value between 1 and 30");
        }

        double mortage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments)));

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage: " + mortageFormatted);
    }
}
