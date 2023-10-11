package com.project.exceptionhandling.exceptionHandling;

public class ForbiddenException extends RuntimeException{
    public ForbiddenException(String message) {
        super(message);
    }
}
