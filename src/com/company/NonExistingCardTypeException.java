package com.company;

public class NonExistingCardTypeException extends IllegalCardException {
    public NonExistingCardTypeException(String message, Throwable cause){
        super(message, cause);
    }
    public NonExistingCardTypeException(String message){
        super(message);
    }
}
