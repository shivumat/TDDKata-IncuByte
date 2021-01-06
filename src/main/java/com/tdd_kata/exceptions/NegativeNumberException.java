package com.tdd_kata.exceptions;

public class NegativeNumberException extends Exception{

    public NegativeNumberException() {
        super("Negative Values Not Allowed");
    }
}
