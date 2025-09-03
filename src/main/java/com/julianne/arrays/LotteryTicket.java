package com.julianne.arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    // constants - they never change ex. the lottery has 6 numbers and the max number is 69
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        // variable for an array of numbers
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        // the array has a length of 6 numbers
        int[] ticket = new int[LENGTH];
        // class for generating random things
        Random random = new Random();
        // populate the array with random numbers
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            // do while - because we want it to run at least once
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber)); //
            // add the different number to the ticket
            ticket[i] = randomNumber;
        }
        return ticket;
    }
    // search the array for duplicates
    public static boolean search(int[] array, int numberToSearchFor) {
        // take the element from array and assign it to value, do whatever and loop
        for(int value : array) {
            if(value == numberToSearchFor) {
                return true;
            } // no else false, to continue going through the loop
        } return  false; // after it's done it's safe to say false
    }

    public static void printTicket(int[] array) {
        // sort the array in order
        Arrays.sort(array);
        // use enhanced for on already populated arrays
        for(int number : array) {
            System.out.print(number + "  | ");
        }
        // another way to print this out
        /* for(inti = 0; i < array.length; i++) {
         *       System.out.print(array[i] + " | ");
         *  }
        */
    }
}
