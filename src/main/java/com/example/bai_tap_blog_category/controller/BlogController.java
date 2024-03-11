package com.example.bai_tap_blog_category.controller;

import com.example.bai_tap_blog_category.model.Blog;
import com.example.bai_tap_blog_category.model.Category;
import com.example.bai_tap_blog_category.service.blog.IBlogService;
import com.example.bai_tap_blog_category.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;

    @ModelAttribute("category")
    public Iterable<Category> findAllCategory() {
        return iCategoryService.findAll();
    }

    @GetMapping
    public ResponseEntity<Iterable<Blog>> findAllBlog() {
        Iterable<Blog> blogs = iBlogService.findAll();
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> findById(@PathVariable Long id) {
        Optional<Blog>blogOptional = iBlogService.findById(id);
        if(!blogOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogOptional.get(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(iBlogService.save(blog),HttpStatus.CREATED);
    }


}
