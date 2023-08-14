package com.springboot.travelblog.travelblogapp.rest;

import com.springboot.travelblog.travelblogapp.entity.TravelBlogger;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TravelBloggerRestController {

//    private List<TravelBlogger> theTravelBloggers;
//
//    @PostConstruct
//    public void loadData() {
//        theTravelBloggers = new ArrayList<>();
//        theTravelBloggers.add(new TravelBlogger("Noleen", "Prasad", "noleenprasad@gmail.com"));
//        theTravelBloggers.add(new TravelBlogger("Nishant", "Vyas", "nishantvyas@gmail.com"));
//        theTravelBloggers.add(new TravelBlogger("Cosmo", "Kramer", "cosmokramer@gmail.com"));
//    }
//
//    @GetMapping("/travelBloggers")
//    public List<TravelBlogger> getTravelBloggers() {
//        return theTravelBloggers;
//    }
//
//    @GetMapping("/travelBloggers/{travelBloggerId}")
//    public TravelBlogger getTravelBlogById(@PathVariable int travelBloggerId) {
//        if (travelBloggerId >= theTravelBloggers.size() || travelBloggerId < 0) {
//            throw new TravelBloggerNotFoundException("Travel Blogger with id " + travelBloggerId + " not found.");
//        }
//
//        return theTravelBloggers.get(travelBloggerId);
//    }
}
