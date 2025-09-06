package com.julianne.exceptions;

// create your own exception
public class NegativeInputException extends Exception {

    // add a couple of constructors that provide the cause/message
    public NegativeInputException() {
        // this() calls the constructor - line 12 - given a string calls this constructor that takes a string
        this("Input must be greater than or equal to 0"); // a great way to provide a message by default
    }

    public NegativeInputException(String message) {
        super(message);
    }
}
