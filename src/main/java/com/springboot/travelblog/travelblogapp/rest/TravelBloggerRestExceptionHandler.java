package com.springboot.travelblog.travelblogapp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TravelBloggerRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<TravelBloggerErrorResponse> handleException(TravelBloggerNotFoundException exc) {
        TravelBloggerErrorResponse errorResponse = new TravelBloggerErrorResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<TravelBloggerErrorResponse> handleException(Exception exc) {
        TravelBloggerErrorResponse errorResponse = new TravelBloggerErrorResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

}
