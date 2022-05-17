package com.bridgelabz;

public class UserRegistrationException extends Exception {
    /**
     * @Author: Nikhil Deshmukh
     * Refactor the Code to throw custom exceptions in case of Invalid User Details
     */
    private static final long serialVersionUID = 1L;

    public UserRegistrationException(String message) {
        super(message);
    }
}