package com.example.springbootmongodbexample.exception;

/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 9/25/2020
 */
public class AlreadyExistException extends ServiceException{
    public AlreadyExistException() {
        super("exception.already_exist");
    }
    public AlreadyExistException(String message) {
        super(message);
    }
}
