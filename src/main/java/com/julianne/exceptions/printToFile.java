package com.julianne.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

// autoclose closes in reverse - so first writer then reader - first and last out
public class printToFile {

    public static void main(String[] args) {

        File inputFile = new File("files/numbers.txt");
        File outputFile = new File("files/output.txt");
        try (
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile)
            ) {
            while (fileReader.hasNext()) {
                // print it in the file
                fileWriter.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
