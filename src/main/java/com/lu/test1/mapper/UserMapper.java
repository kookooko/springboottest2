package com.lu.test1.mapper;

import com.lu.test1.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

public interface UserMapper {
    User findUserById3(Integer id);
    void addUser(User user);
}
