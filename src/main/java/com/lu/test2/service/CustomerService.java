package com.lu.test2.service;

import com.lu.test2.model.Customer;

public interface CustomerService {
    Customer findCustomer(Integer id);
    void addCustomer(Customer customer);
}
