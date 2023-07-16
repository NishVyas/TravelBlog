package com.springboot.travelblog.travelblogapp.dao;

import com.springboot.travelblog.travelblogapp.entity.TravelBlogger;

import java.util.List;

public interface TravelBloggerDAO {

    void save(TravelBlogger travelBlogger);

    TravelBlogger findById(Integer id);

    List<TravelBlogger> findAll();

    List<TravelBlogger> findByLastName(String last_name);

    void update(TravelBlogger travelBlogger);
}
