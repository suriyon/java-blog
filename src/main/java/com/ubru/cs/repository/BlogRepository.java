package com.ubru.cs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubru.cs.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
