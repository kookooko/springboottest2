package com.lu.test2.mapper;

import com.lu.test2.model.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

public interface CustomerMapper {
    Customer findCustomer(Integer id);
    void addCustomer(Customer customer);
}
