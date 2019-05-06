package com.lu.dao.impl;

import com.lu.dao.UserDao;
import com.lu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User findUserById(Integer id) {
        return jdbcTemplate.queryForObject("select * from user where id = ?", new BeanPropertyRowMapper<User>(User.class), id);
    }
}
