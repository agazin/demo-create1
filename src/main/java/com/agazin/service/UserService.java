package com.agazin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agazin.entity.Blog;
import com.agazin.entity.Item;
import com.agazin.entity.User;
import com.agazin.repository.BlogRepository;
import com.agazin.repository.ItemRepository;
import com.agazin.repository.UserRepository;

@Service
public class UserService {
	@Autowired 
	UserRepository userRepository;
	@Autowired
	BlogRepository blogRepository;
	@Autowired
	ItemRepository itemRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}
	
	
	public User findOneWithBlog(int id) {
		User user = findOne(id);
		List<Blog> blogs = blogRepository.findByUser(user);
		user.setBlogs(blogs);
		for (Blog blog : blogs) {
			List<Item> items = itemRepository.findByBlog(blog);
			blog.setItems(items);
		}
		return user;
	}
}
