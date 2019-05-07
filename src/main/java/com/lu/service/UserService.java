package com.lu.service;


import com.lu.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserService {
    void addUser(String username,Date birthday,String sex,String address);
}
