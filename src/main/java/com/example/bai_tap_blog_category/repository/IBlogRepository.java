package com.example.bai_tap_blog_category.repository;

import com.example.bai_tap_blog_category.model.Blog;
import org.springframework.data.repository.CrudRepository;

public interface IBlogRepository extends CrudRepository<Blog,Long> {
}
