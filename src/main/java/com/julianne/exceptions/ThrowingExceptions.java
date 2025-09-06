package com.julianne.exceptions;

// throw - flag errors in your code with throwing exceptions by yourself
public class ThrowingExceptions {

    public static double calculatePay(double hours, double payRate)
            throws NegativeInputException {
                // overtime
                if (hours < 40) {
                    throw new IllegalArgumentException("Hours must be greater than or equal to 40");
                } else if (hours < 0 || payRate < 0) {
                    throw new NegativeInputException();
                }

                return payRate * hours;
    }
}
