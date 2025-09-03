package com.julianne.strings;

public class TextProcessor2 {

    public static void main(String[] args) {
        
        reverseString("Hello World");
    }

    private static void reverseString(String text) {
        // start at the back of the string but -1 because the length is the last index number
        for(int i=text.length()-1;i>=0;i--){
            System.out.print( text.charAt(i));
        }
    }
}
