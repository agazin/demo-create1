package com.agazin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agazin.entity.Blog;
import com.agazin.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	public List<Blog> findByUser(User user);
}
