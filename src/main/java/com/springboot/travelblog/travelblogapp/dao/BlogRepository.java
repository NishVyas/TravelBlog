package com.springboot.travelblog.travelblogapp.dao;

import com.springboot.travelblog.travelblogapp.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
