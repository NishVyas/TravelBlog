package com.springboot.travelblog.travelblogapp.service;


import com.springboot.travelblog.travelblogapp.dao.BlogDAO;
import com.springboot.travelblog.travelblogapp.dao.BlogRepository;
import com.springboot.travelblog.travelblogapp.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

//    private BlogDAO blogDao;
//    private BlogRepository blogRepository;
//
//    @Autowired
//    public BlogServiceImpl(BlogDAO blogDao, BlogRepository blogRepository) {
//        this.blogDao = blogDao;
//        this.blogRepository = blogRepository;
//    }
//
//    @Override
//    public List<Blog> findAll() {
////        return blogDao.findAll();
//        return blogRepository.findAll();
//    }
//
//    @Override
//    public Blog findById(int theId) {
////        return blogDao.findById(theId);
//        Optional<Blog> result = blogRepository.findById(theId);
//
//        Blog theBlog = null;
//        if (result.isPresent()) {
//            theBlog = result.get();
//        } else {
//            throw new RuntimeException("Did not find Blog id: " + theId);
//        }
//
//        return theBlog;
//    }
//
//    //    @Transactional
//    @Override
//    public Blog save(Blog theBlog) {
////        return blogDao.save(theBlog);
//        return blogRepository.save(theBlog);
//    }
//
//    //    @Transactional
//    @Override
//    public void deleteById(int theId) {
////        blogDao.deleteById(theId);
//        blogRepository.deleteById(theId);
//    }
}
