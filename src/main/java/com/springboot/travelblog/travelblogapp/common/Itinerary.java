package com.springboot.travelblog.travelblogapp.common;

public class Itinerary implements TravelBlogEntry{

    public Itinerary() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getTravelBlogEntryType() {
        return "This Travel Blog entry is of the 'Itinerary' type.";
    }
}
