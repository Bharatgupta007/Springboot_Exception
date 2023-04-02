package com.example.tutorial.exception;

import java.util.Date;

public class CreateException {

    String message;
    int code;

    Date time;

    public CreateException(String message, int code, Date time) {
        this.message = message;
        this.code = code;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public CreateException() {
    }

    @Override
    public String toString() {
        return "CreateException{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", time=" + time +
                '}';
    }
}

