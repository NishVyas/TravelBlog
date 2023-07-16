package com.springboot.travelblog.travelblogapp.dao;

import com.springboot.travelblog.travelblogapp.entity.TravelBlogger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public TravelBlogger findById(Integer id) {
        return entityManager.find(TravelBlogger.class, id);
    }

    @Override
    public List<TravelBlogger> findAll() {
        TypedQuery<TravelBlogger> travelBloggerQuery = entityManager.createQuery("FROM TravelBlogger ORDER BY last_name ASC", TravelBlogger.class);

        return travelBloggerQuery.getResultList();
    }

    @Override
    public List<TravelBlogger> findByLastName(String last_name) {
        TypedQuery<TravelBlogger> travelBloggerQuery = entityManager.createQuery("FROM TravelBlogger WHERE last_name=:theData", TravelBlogger.class);
        travelBloggerQuery.setParameter("theData", last_name);
        return travelBloggerQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(TravelBlogger travelBlogger) {
        entityManager.merge(travelBlogger);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        TravelBlogger travelBlogger = entityManager.find(TravelBlogger.class, id);
        entityManager.remove(travelBlogger);
    }

    @Override
    @Transactional
    public int deleteAll() {
        return entityManager.createQuery("DELETE FROM TravelBlogger").executeUpdate();
    }

}
