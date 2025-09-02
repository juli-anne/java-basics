package com.julianne.decision_structure;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        // define variables
        double salary = 1000;
        double bonus = 200;
        int qouta = 10;

        // ask for inputs and store it
        System.out.println("How many sales did the employee get this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > qouta) {
            salary += bonus;
        }

        System.out.println("Salary " + salary);
    }
}
