package com.springboot.travelblog.travelblogapp.common;

import org.springframework.stereotype.Component;

@Component
public class TripPreparation implements TravelBlogEntry {

    public TripPreparation() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getTravelBlogEntryType() {
        return "This Travel Blog entry is of the 'Trip Preparation' type.";
    }
}
