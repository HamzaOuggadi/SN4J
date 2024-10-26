package com.hamzaouggadi.sn4jusersms.exceptions;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class AppUserException extends RuntimeException {

    private String message;
    private HttpStatus httpStatus;
    private final LocalDateTime timestamp;

    public AppUserException() {
        super();
        this.timestamp = LocalDateTime.now();
    }

    public AppUserException(String message) {
        super(message);
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public AppUserException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
