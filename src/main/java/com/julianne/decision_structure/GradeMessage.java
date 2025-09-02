package com.julianne.decision_structure;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        // switch case
        /*
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
        */

        // switch expressions
        String message = switch(grade) {
            case "A" -> "Excellent job!";
            // or case "A", "B" -> "Excellent job!";
            case "B" -> "Good job!";
            case "C" -> "You've done okay!";
            case "D" -> "Well, you passed.";
            case "E" -> "Sorry, you failed.";
            default -> "Error. Invalid grade!";
        };

        System.out.println(message);
    }
}
