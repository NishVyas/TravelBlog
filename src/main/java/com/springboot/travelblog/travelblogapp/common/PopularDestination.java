package com.springboot.travelblog.travelblogapp.common;

import org.springframework.stereotype.Component;

@Component
public class PopularDestination implements TravelBlogEntry{

    public PopularDestination() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getTravelBlogEntryType() {
        return "This Travel Blog entry is of the 'Popular Destination' type.";
    }
}