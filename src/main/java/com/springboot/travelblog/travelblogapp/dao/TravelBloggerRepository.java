package com.springboot.travelblog.travelblogapp.dao;

import com.springboot.travelblog.travelblogapp.entity.TravelBlogger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="travelBloggers")
public interface TravelBloggerRepository extends JpaRepository<TravelBlogger, Integer> {
}
