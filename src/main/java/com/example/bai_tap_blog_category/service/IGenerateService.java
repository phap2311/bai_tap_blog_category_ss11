package com.example.bai_tap_blog_category.service;

import java.util.Optional;

public interface IGenerateService<B> {
    Iterable<B> findAll();
    B save(B b);
    Optional<B>findById(Long id);
    void remove(Long id);
}
