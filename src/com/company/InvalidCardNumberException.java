package com.company;

public class InvalidCardNumberException extends IllegalCardException {
    public InvalidCardNumberException(String message, Throwable cause){
        super(message, cause);
    }

    public InvalidCardNumberException(String message){
        super(message);
    }
}
