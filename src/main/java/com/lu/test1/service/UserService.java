package com.lu.test1.service;


import com.lu.test1.model.User;

public interface UserService {
    User findUserById3(Integer id);
    void addUser(User user);
}
