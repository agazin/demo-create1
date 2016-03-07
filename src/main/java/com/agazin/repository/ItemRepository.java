package com.agazin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agazin.entity.Blog;
import com.agazin.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	public List<Item> findByBlog(Blog blog);
}
