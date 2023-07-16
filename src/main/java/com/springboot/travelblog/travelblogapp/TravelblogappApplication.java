package com.springboot.travelblog.travelblogapp;

import com.springboot.travelblog.travelblogapp.dao.TravelBloggerDAO;
import com.springboot.travelblog.travelblogapp.entity.TravelBlogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TravelblogappApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelblogappApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(TravelBloggerDAO travelBloggerDAO) {
        return runner -> {
//            createTravelBlogger(travelBloggerDAO);
            createMultipleTravelBloggers(travelBloggerDAO);
        };
    }

    private void createMultipleTravelBloggers(TravelBloggerDAO travelBloggerDAO) {
        System.out.println("Creating multiple Travel Bloggers...");
        TravelBlogger travelBlogger = new TravelBlogger("Kid", "Rock", "kid.rock@gmail.com");
        TravelBlogger travelBlogger2 = new TravelBlogger("John", "Doe", "john.doe@gmail.com");
        TravelBlogger travelBlogger3 = new TravelBlogger("Elliot", "Anderson", "elliot.anderson@gmail.com");

        System.out.println("Saving the Travel Bloggers...");
        travelBloggerDAO.save(travelBlogger);
        travelBloggerDAO.save(travelBlogger2);
        travelBloggerDAO.save(travelBlogger3);

        System.out.println("Saved Travel Blogger. Generated ID: " + travelBlogger.getId());
        System.out.println("Saved Travel Blogger. Generated ID: " + travelBlogger2.getId());
        System.out.println("Saved Travel Blogger. Generated ID: " + travelBlogger3.getId());
    }

    private void createTravelBlogger(TravelBloggerDAO travelBloggerDAO) {
        System.out.println("Creating a new Travel Blogger...");
        TravelBlogger travelBlogger = new TravelBlogger("Nishant", "Vyas", "nishant.vyas@gmail.com");

        System.out.println("Saving the Travel Blogger...");
        travelBloggerDAO.save(travelBlogger);

        System.out.println("Saved Travel Blogger. Generated ID: " + travelBlogger.getId());
    }


}
