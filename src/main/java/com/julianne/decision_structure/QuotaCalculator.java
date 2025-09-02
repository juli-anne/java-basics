package com.julianne.decision_structure;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        int qouta = 10;

        System.out.println("Enter the number of sales made");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= qouta) {
            System.out.println("Congrats! You've met your qouta.");
        } else  {
            int salesShort = qouta - sales;
            System.out.println("You did not met your qouta." + "You were " +  salesShort + "sales short.");
        }
    }
}
