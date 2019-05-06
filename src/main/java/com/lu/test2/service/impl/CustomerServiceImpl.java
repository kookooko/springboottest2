package com.lu.test2.service.impl;

import com.lu.test2.mapper.CustomerMapper;
import com.lu.test2.model.Customer;
import com.lu.test2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public Customer findCustomer(Integer id) {
        return customerMapper.findCustomer(id);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerMapper.addCustomer(customer);
       // int a = 1 / 0;
    }
}
