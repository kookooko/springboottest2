package com.lu.test1.service.impl;

import com.lu.test1.mapper.UserMapper;
import com.lu.test1.model.User;
import com.lu.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(value = "test1TransactionManager")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById3(Integer id) {
        return userMapper.findUserById3(id);
    }


    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
        //int a=1/0;
    }


}
