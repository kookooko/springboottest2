package com.lu.test1.service.impl;

import com.lu.test1.mapper.UserMapper;
import com.lu.test1.model.User;
import com.lu.test1.service.UserService;
import com.lu.test2.mapper.CustomerMapper;
import com.lu.test2.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public User findUserById3(Integer id) {
        return userMapper.findUserById3(id);
    }


    @Override
    public void addUser(User user) {
        customerMapper.addCustomer(new Customer("lisi", "123456789"));
        int a=1/0;
        userMapper.addUser(user);
        //int a=1/0;
    }


}
