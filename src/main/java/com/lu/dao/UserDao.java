package com.lu.dao;

import com.lu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public interface UserDao {
    User findUserById(Integer id);
}
