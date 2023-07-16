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
            createTravelBlogger(travelBloggerDAO);
        };
    }

    private void createTravelBlogger(TravelBloggerDAO travelBloggerDAO) {
        System.out.println("Creating a new Travel Blogger...");
        TravelBlogger travelBlogger = new TravelBlogger("Nishant", "Vyas", "nishant.vyas@gmail.com");

        System.out.println("Saving the Travel Blogger...");
        travelBloggerDAO.save(travelBlogger);

        System.out.println("Saved Travel Blogger. Generated ID: " + travelBlogger.getId());
    }


}
