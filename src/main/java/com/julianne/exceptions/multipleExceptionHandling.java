package com.julianne.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class multipleExceptionHandling {

    public static void main(String[] args) {

        File file = new File("files/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            // read from the file
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble()); // throws an exception because expected double
        } // catch (FileNotFoundException | InputMismatchException e ) {
//            e.printStackTrace(); // catch in a single line
//        }

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e.getMessage());
        } finally {
            assert fileReader != null;
            fileReader.close();
        }
    }
}
