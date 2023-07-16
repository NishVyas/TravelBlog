package com.springboot.travelblog.travelblogapp;

import com.springboot.travelblog.travelblogapp.dao.TravelBloggerDAO;
import com.springboot.travelblog.travelblogapp.entity.TravelBlogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TravelblogappApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelblogappApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(TravelBloggerDAO travelBloggerDAO) {
        return runner -> {
//            createTravelBlogger(travelBloggerDAO);
//            createMultipleTravelBloggers(travelBloggerDAO);
//            readTravelBlogger(travelBloggerDAO);
//            queryForTravelBloggers(travelBloggerDAO);
//            queryForTravelBloggersByLastName(travelBloggerDAO);
            updateTravelBlogger(travelBloggerDAO);
        };
    }

    private void createTravelBlogger(TravelBloggerDAO travelBloggerDAO) {
        System.out.println("Creating a new Travel Blogger...");
        TravelBlogger travelBlogger = new TravelBlogger("Nishant", "Vyas", "nishant.vyas@gmail.com");

        System.out.println("Saving the Travel Blogger...");
        travelBloggerDAO.save(travelBlogger);

        System.out.println("Saved Travel Blogger. Generated ID: " + travelBlogger.getId());
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

    private void readTravelBlogger(TravelBloggerDAO travelBloggerDAO) {
        System.out.println("Creating a new Travel Blogger...");
        TravelBlogger travelBlogger = new TravelBlogger("Noleen", "Prasad", "noleen.prasad@gmail.com");

        System.out.println("Saving the Travel Blogger...");
        travelBloggerDAO.save(travelBlogger);

        System.out.println("Saved Travel Blogger. Generated ID: " + travelBlogger.getId());

        System.out.println("Retrieveing Travel Blogger with ID: " + travelBlogger.getId());
        TravelBlogger myTravelBlogger = travelBloggerDAO.findById(travelBlogger.getId());

        System.out.println("Found the Travel Blogger: " + myTravelBlogger);
    }

    private void queryForTravelBloggers(TravelBloggerDAO travelBloggerDAO) {
        List<TravelBlogger> travelBloggers = travelBloggerDAO.findAll();

        for (TravelBlogger travelBlogger : travelBloggers) {
            System.out.println(travelBlogger);
        }
    }

    private void queryForTravelBloggersByLastName(TravelBloggerDAO travelBloggerDAO) {
        List<TravelBlogger> travelBloggers = travelBloggerDAO.findByLastName("Prasad");

        for (TravelBlogger travelBlogger : travelBloggers) {
            System.out.println(travelBlogger);
        }
    }

    private void updateTravelBlogger(TravelBloggerDAO travelBloggerDAO) {
        int travelBloggerId = 20;
        System.out.println("Getting Travel Blogger with ID: " + travelBloggerId);
        TravelBlogger myTravelBlogger = travelBloggerDAO.findById(travelBloggerId);

        System.out.println("Updating Travel Blogger...");
        myTravelBlogger.setFirst_name("Scooby");

        travelBloggerDAO.update(myTravelBlogger);

        System.out.println("Updated Travel Blogger: " + myTravelBlogger);
    }
}
