package com.agazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agazin.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
