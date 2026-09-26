package com.sate.Exception;

//User defined Exception class
public class InsufficientBalanceException extends Exception {
    
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
