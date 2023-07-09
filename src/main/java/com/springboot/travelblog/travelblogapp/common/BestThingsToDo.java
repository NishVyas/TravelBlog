package com.springboot.travelblog.travelblogapp.common;

import org.springframework.stereotype.Component;

@Component
public class BestThingsToDo implements TravelBlogEntry {

    public BestThingsToDo() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getTravelBlogEntryType() {
        return "This Travel Blog entry is of the 'Best Things To Do' type.";
    }
}
