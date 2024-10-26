package com.hamzaouggadi.sn4jusersms.utils;

import com.hamzaouggadi.sn4jusersms.exceptions.AppUserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(AppUserException.class)
    public ResponseEntity<GenericMessage<HttpStatus>> handleException(AppUserException ex) {
        GenericMessage<HttpStatus> message = new GenericMessage<>(
                ex.getMessage(),
                ex.getHttpStatus()
        );
        return new ResponseEntity<>(message, ex.getHttpStatus());
    }
}
