package com.company;

public class IllegalCardException extends RuntimeException {
    public IllegalCardException(String message) {
        super(message);
    }

    public IllegalCardException(String message, Throwable cause) {
        super(message, cause);
    }
}
