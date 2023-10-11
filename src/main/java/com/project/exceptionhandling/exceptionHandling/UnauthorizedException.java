package com.project.exceptionhandling.exceptionHandling;

public class UnauthorizedException extends RuntimeException{
    public UnauthorizedException(String message) {
        super(message);
    }
}
