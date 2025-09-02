package com.julianne.methods;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 2500;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified( salary, creditScore);

        notifyUser(qualified);
    }

    public static void notifyUser(boolean qualified) {
        if(qualified) {
            System.out.println("You are qualified!");
        } else  {
            System.out.println("Sorry, you are unqualified.");
        }
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        } else  {
            return false;
        }

        // return (salary >= requiredSalary && creditScore >= requiredCreditScore);
    }

    public static double getSalary() {
        System.out.println("Please enter your salary");
        int salary = scanner.nextInt();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Please enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
}
