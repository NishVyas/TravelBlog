package com.springboot.travelblog.travelblogapp.dao;

import com.springboot.travelblog.travelblogapp.entity.Blog;

import java.util.List;

public interface BlogDAO {
    List<Blog> findAll();
}
