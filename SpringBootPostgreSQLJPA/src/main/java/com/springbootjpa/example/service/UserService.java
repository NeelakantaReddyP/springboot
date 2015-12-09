package com.springbootjpa.example.service;

import java.util.List;

import com.springbootjpa.example.domain.User;

public interface UserService {

    User save(User user);

    List<User> getList();

}
