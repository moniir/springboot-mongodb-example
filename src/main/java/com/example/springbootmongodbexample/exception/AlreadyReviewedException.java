package com.example.springbootmongodbexample.exception;

/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 11/8/2020
 */
public class AlreadyReviewedException extends ServiceException{
    public AlreadyReviewedException() {
        super("exception.already_reviewed");
    }
}
