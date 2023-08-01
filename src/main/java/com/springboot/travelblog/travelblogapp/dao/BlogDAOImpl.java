package com.springboot.travelblog.travelblogapp.dao;

import com.springboot.travelblog.travelblogapp.entity.Blog;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogDAOImpl implements BlogDAO {

    private EntityManager entityManager;

    @Autowired
    public BlogDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> blogQuery = entityManager.createQuery("FROM Blog ORDER BY title ASC", Blog.class);

        return blogQuery.getResultList();
    }

    @Override
    public Blog findById(int theId) {
        return entityManager.find(Blog.class, theId);
    }

    @Override
    public Blog save(Blog theBlog) {
        // If id == 0, then insert/save, else update
        return entityManager.merge(theBlog);
    }

    @Override
    public void deleteById(int theId) {
        Blog theBlog = entityManager.find(Blog.class, theId);
        entityManager.remove(theBlog);
    }
}
