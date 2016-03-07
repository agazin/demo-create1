package com.agazin.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agazin.entity.Blog;
import com.agazin.entity.Item;
import com.agazin.entity.Role;
import com.agazin.entity.User;
import com.agazin.repository.BlogRepository;
import com.agazin.repository.ItemRepository;
import com.agazin.repository.RoleRepository;
import com.agazin.repository.UserRepository;

@Transactional
@Service
public class InitDBService {

	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BlogRepository blogRepository;
	@Autowired
	private ItemRepository itemRepository;

	@PostConstruct
	public void initDb() {
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);

		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);

		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);

		Blog blog = new Blog();
		blog.setName("Javavids");
		blog.setUrl("http://google.com");
		blog.setUser(userAdmin);
		blogRepository.save(blog);

		Item item1 = new Item();
		item1.setBlog(blog);
		item1.setTitle("first");
		item1.setDescription("first Blog");
		item1.setLink("http://google.com");
		item1.setPublishedDate(new Date());
		itemRepository.save(item1);

		Item item2 = new Item();
		item2.setBlog(blog);
		item2.setTitle("second");
		item2.setDescription("second Blog");
		item2.setLink("http://yahoo.com");
		item2.setPublishedDate(new Date());
		itemRepository.save(item2);
	}
}
