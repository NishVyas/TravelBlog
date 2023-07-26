package com.springboot.travelblog.travelblogapp.rest;

public class TravelBloggerNotFoundException extends RuntimeException {

    public TravelBloggerNotFoundException(String message) {
        super(message);
    }

    public TravelBloggerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TravelBloggerNotFoundException(Throwable cause) {
        super(cause);
    }
}
