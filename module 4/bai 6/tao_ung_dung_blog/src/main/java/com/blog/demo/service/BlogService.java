package com.blog.demo.service;

import com.blog.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    void saveBlog(Blog blog);
    void deleteBlog(Long id);
    Blog findBlogById(Long id);
}
