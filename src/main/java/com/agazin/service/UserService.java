package com.agazin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agazin.entity.User;
import com.agazin.repository.UserRepository;

@Service
public class UserService {
	@Autowired 
	UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
}
