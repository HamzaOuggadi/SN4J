package com.hamzaouggadi.sn4jusersms.utils;

import java.time.LocalDateTime;

public class GenericMessage<T> {

    private String message;
    private T data;
    private LocalDateTime timestamp;

    public GenericMessage() {
        this.timestamp = LocalDateTime.now();
    }

    public GenericMessage(String message) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }

    public GenericMessage(String message, T data) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
