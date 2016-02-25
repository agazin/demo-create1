package com.agazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agazin.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
