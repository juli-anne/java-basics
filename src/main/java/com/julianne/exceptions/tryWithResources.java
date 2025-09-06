package com.julianne.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

// try with resources - declaration of resources that should be automatically closed after the
// execution of a try block - autoclose the file reader
public class tryWithResources {

    public static void main(String[] args) {

        File file = new File("files/numbers.txt");
        // put the declaration in the parenthesis
        // this declared it as a resource that we want closed after this block
        // these have to be the subclass of the autocloseable class
        try (Scanner fileReader = new Scanner(file);) {
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
