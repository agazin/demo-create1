package com.agazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agazin.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
