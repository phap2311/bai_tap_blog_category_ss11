package com.example.bai_tap_blog_category.model;

import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameC;

    public Category() {
    }

    public Category(Long id, String nameC) {
        this.id = id;
        this.nameC = nameC;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }
}
