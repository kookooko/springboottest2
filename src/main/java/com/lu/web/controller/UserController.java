package com.lu.web.controller;

import com.lu.model.Student;
import com.lu.model.User;
import com.lu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("list")
    @ResponseBody
    public String save(String username,Date birthday,String sex,String address) {
       userService.addUser(username,birthday,sex,address);
       return "success";
    }
    @RequestMapping("login")
    public String login(){
        return "stu/list";
    }
}
