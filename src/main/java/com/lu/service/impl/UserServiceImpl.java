package com.lu.service.impl;

import com.lu.mapper.UserMapper;
import com.lu.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(String username,Date birthday,String sex,String address) {
        userMapper.addUser(username,birthday,sex,address);
    }


}
