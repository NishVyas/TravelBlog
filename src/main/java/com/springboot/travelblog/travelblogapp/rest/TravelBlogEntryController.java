package com.springboot.travelblog.travelblogapp.rest;

import com.springboot.travelblog.travelblogapp.common.LocationTravelGuide;
import com.springboot.travelblog.travelblogapp.common.TravelBlogEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelBlogEntryController {

    private TravelBlogEntry travelBlogEntry;

    @Autowired
    public TravelBlogEntryController(@Qualifier("popularDestination") TravelBlogEntry travelBlogEntry) {
        this.travelBlogEntry = travelBlogEntry;
    }

    @GetMapping("/travelBlogEntry")
    public String getLocationTravelGuide() {
        return travelBlogEntry.getTravelBlogEntryType();
    }

}
