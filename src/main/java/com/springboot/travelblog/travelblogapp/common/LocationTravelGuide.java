package com.springboot.travelblog.travelblogapp.common;

import org.springframework.stereotype.Component;

@Component
public class LocationTravelGuide implements TravelBlogEntry {
    @Override
    public String getTravelBlogEntryType() {
        return "This Travel Blog entry is of the 'Location Travel Guide' type.";
    }
}
