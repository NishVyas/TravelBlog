package com.springboot.travelblog.travelblogapp.rest;

import com.springboot.travelblog.travelblogapp.dao.BlogDAO;
import com.springboot.travelblog.travelblogapp.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogRestController {

    private BlogDAO blogDao;

    @Autowired
    public BlogRestController(BlogDAO blogDao) {
        this.blogDao = blogDao;
    }

    @GetMapping("/blogs")
    public List<Blog> getBlogs() {
        return blogDao.findAll();
    }
}
