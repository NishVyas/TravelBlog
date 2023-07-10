package com.springboot.travelblog.travelblogapp.config;

import com.springboot.travelblog.travelblogapp.common.Itinerary;
import com.springboot.travelblog.travelblogapp.common.TravelBlogEntry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TravelBlogConfig {

    @Bean
    public TravelBlogEntry itinerary() {
        return new Itinerary();
    }
}
