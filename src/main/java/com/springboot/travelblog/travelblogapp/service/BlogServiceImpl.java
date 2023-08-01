package com.springboot.travelblog.travelblogapp.service;


import com.springboot.travelblog.travelblogapp.dao.BlogDAO;
import com.springboot.travelblog.travelblogapp.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    private BlogDAO blogDao;

    @Autowired
    public BlogServiceImpl(BlogDAO blogDao) {
        this.blogDao = blogDao;
    }

    @Override
    public List<Blog> findAll() {
        return blogDao.findAll();
    }

    @Override
    public Blog findById(int theId) {
        return blogDao.findById(theId);
    }

    @Transactional
    @Override
    public Blog save(Blog theBlog) {
        return blogDao.save(theBlog);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        blogDao.deleteById(theId);
    }
}
