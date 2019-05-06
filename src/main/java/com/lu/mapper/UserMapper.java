package com.lu.mapper;

import com.lu.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User findUserById(@Param("id") Integer id);
    User findUserById3(Integer id);
}
