package com.stackroute.multimodelservice.exceptions;

public class UserAlreadyCreatedException extends Exception
{
    private String message;

    public UserAlreadyCreatedException()
    {

    }

    public UserAlreadyCreatedException(String message) {
        super(message);
        this.message = message;
    }
}
