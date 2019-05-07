package com.lu.mapper;

import com.lu.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserMapper {
    @Insert("insert into user (username,birthday,sex,address) values (#{username},#{birthday},#{sex},#{address})")
    void addUser(@Param("username") String username, @Param("birthday")Date birthday, @Param("sex") String sex, @Param("address") String address);
}
