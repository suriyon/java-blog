package com.ubru.cs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubru.cs.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
