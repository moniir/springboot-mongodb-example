package com.example.springbootmongodbexample.exception;

/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 9/25/2020
 */
public class NotProgramNameFoundException extends ServiceException{
    public NotProgramNameFoundException() {
        super("exception.program_name_not_found");
    }
}
