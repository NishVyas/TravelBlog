package com.springboot.travelblog.travelblogapp.rest;

import com.springboot.travelblog.travelblogapp.entity.Blog;
import com.springboot.travelblog.travelblogapp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogEntries")
public class BlogRestController {

    private BlogService blogService;

    @Autowired
    public BlogRestController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/blogs")
    public List<Blog> getBlogs() {
        return blogService.findAll();
    }

    @GetMapping("/blog/{blogId}")
    public Blog getBlog(@PathVariable int blogId) {
        Blog theBlog = blogService.findById(blogId);

        if (theBlog == null) {
            throw new RuntimeException("Blog id not found: " + blogId);
        }

        return theBlog;
    }

    @PostMapping("/blog")
    public Blog addBlog(@RequestBody Blog theBlog) {
        theBlog.setId(0);
        return blogService.save(theBlog);
    }

    @PutMapping("/blog")
    public Blog updateBlog(@RequestBody Blog theBlog) {
        return blogService.save(theBlog);
    }

    @DeleteMapping("/blog/{blogId}")
    public String deleteBlogById(@PathVariable int blogId) {
        Blog tempBlog = blogService.findById(blogId);

        if (tempBlog == null) {
            throw new RuntimeException("Blog with id not found: " + blogId);
        }

        blogService.deleteById(blogId);

        return "Deleted Blog id: " + blogId;
    }
}
