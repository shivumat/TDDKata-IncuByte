package com.tdd_kata.exceptions;

import java.util.List;

public class NegativeNumberException extends Exception{

    public NegativeNumberException(List negativeNumbers) {
        super("Negative Values Not Allowed " + negativeNumbers.toString());
    }
}
