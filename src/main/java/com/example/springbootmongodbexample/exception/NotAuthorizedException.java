package com.example.springbootmongodbexample.exception;

/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 9/25/2020
 */
public class NotAuthorizedException extends ServiceException{
    public NotAuthorizedException() {
        super("exception.not_authorized");
    }
}
