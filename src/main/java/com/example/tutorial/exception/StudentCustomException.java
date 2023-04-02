package com.example.tutorial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class StudentCustomException {

    @ExceptionHandler
    public ResponseEntity<String> error(Exception e)
    {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<CreateException> error1(StudentExceptionHandler e)
    {
        CreateException createException =new CreateException(e.getMessage(),404,new Date());
        return new ResponseEntity<>(createException, HttpStatusCode.valueOf(createException.getCode()));
    }

}
