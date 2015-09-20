package com.ubru.cs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubru.cs.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
