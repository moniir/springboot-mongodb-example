package com.example.springbootmongodbexample.exception;

/**
 * @Created 28/03/2021
 * @Author monir.hossain
 */
public class FileStorageException extends RuntimeException {

    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
