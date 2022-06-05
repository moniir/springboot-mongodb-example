package com.example.springbootmongodbexample.exception;

/**
 * @Created 25/03/2021
 * @Author monir.hossain
 */
public class FileNotAllowedException extends RuntimeException{
    public FileNotAllowedException() {
        super("exception.file_not_allowed");
    }

    public FileNotAllowedException(String message) {
        super(message);
    }

    public FileNotAllowedException(String message, Throwable cause) {
        super(message, cause);
    }
}