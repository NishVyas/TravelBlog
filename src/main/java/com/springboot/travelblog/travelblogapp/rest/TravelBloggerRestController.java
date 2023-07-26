package com.springboot.travelblog.travelblogapp.rest;

import com.springboot.travelblog.travelblogapp.entity.TravelBlogger;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TravelBloggerRestController {

    private List<TravelBlogger> theTravelBloggers;

    @PostConstruct
    public void loadData() {
        theTravelBloggers = new ArrayList<>();
        theTravelBloggers.add(new TravelBlogger("Noleen", "Prasad", "noleenprasad@gmail.com"));
        theTravelBloggers.add(new TravelBlogger("Nishant", "Vyas", "nishantvyas@gmail.com"));
        theTravelBloggers.add(new TravelBlogger("Cosmo", "Kramer", "cosmokramer@gmail.com"));
    }

    @GetMapping("/travelBloggers")
    public List<TravelBlogger> getTravelBloggers() {
        return theTravelBloggers;
    }

    @GetMapping("/travelBloggers/{travelBloggerId}")
    public TravelBlogger getTravelBlogById(@PathVariable int travelBloggerId) {
        if (travelBloggerId >= theTravelBloggers.size() || travelBloggerId < 0) {
            throw new TravelBloggerNotFoundException("Travel Blogger with id " + travelBloggerId + " not found.");
        }

        return theTravelBloggers.get(travelBloggerId);
    }

    @ExceptionHandler
    public ResponseEntity<TravelBloggerErrorResponse> handleException(TravelBloggerNotFoundException exc) {
        TravelBloggerErrorResponse errorResponse = new TravelBloggerErrorResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<TravelBloggerErrorResponse> handleException(Exception exc) {
        TravelBloggerErrorResponse errorResponse = new TravelBloggerErrorResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
