package com.springboot.travelblog.travelblogapp.dao;

import com.springboot.travelblog.travelblogapp.entity.TravelBlogger;

public interface TravelBloggerDAO {

    void save(TravelBlogger travelBlogger);

    TravelBlogger findById(Integer id);

}
