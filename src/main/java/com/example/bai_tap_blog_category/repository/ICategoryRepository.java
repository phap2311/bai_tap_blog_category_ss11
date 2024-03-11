package com.example.bai_tap_blog_category.repository;

import com.example.bai_tap_blog_category.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category,Long> {
}
