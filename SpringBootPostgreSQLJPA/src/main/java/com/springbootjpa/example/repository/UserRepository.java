package com.springbootjpa.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpa.example.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
