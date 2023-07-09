package com.springboot.travelblog.travelblogapp.common;

import org.springframework.stereotype.Component;

@Component
public class LocationTravelGuide implements TravelBlogEntry {

    public LocationTravelGuide() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getTravelBlogEntryType() {
        return "This Travel Blog entry is of the 'Location Travel Guide' type.";
    }
}
