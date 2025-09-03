package com.julianne.strings;

public class TextProcessor {

    public static void main(String[] args) {

        countWords("I love Java");
    }

    public static void countWords(String text) {
        // split it
        var words = text.split(" ");
        // get the number of words by the length of the variable
        int numberOfWords = words.length;
        // output the number of words
        String message = String.format("The words are: %d words", numberOfWords);
        System.out.println(message);
        // print the words out
        for(String word : words) {
            System.out.println(word);
        }
    }
}
