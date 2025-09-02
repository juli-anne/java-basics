package com.julianne.decision_structure;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Good job!";
                break;
            case "C":
                message = "You've done okay!";
                break;
            case "D":
                message = "Well, you passed.";
                break;
            case "E":
                message = "Sorry, you failed.";
                break;
            default:
                message = "Error. Invalid grade!";
                break;
        }

        System.out.println(message);
    }
}
