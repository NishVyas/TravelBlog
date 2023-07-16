package com.springboot.travelblog.travelblogapp.dao;

import com.springboot.travelblog.travelblogapp.entity.TravelBlogger;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TravelBloggerDAOImpl implements TravelBloggerDAO {
    private EntityManager entityManager;

    @Autowired
    public TravelBloggerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(TravelBlogger travelBlogger) {
        entityManager.persist(travelBlogger);
    }
}
