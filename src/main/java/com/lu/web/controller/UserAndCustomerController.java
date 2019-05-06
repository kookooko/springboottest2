package com.lu.web.controller;

import com.lu.test1.model.User;
import com.lu.test1.service.UserService;
import com.lu.test2.model.Customer;
import com.lu.test2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
@RequestMapping("all")
public class UserAndCustomerController {
    @Autowired
    private UserService userService;
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findall")
    public String find(Model model) {
        Customer customer = customerService.findCustomer(1);
        User user = userService.findUserById3(1);
        model.addAttribute("user", user);
        model.addAttribute("customer", customer);
        return "stu/listall";
    }

    /*public static void main(String[] args) {
        SpringApplication.run(UserController.class,args);
    }*/
    @RequestMapping("/saveall")
    public void findUser2() {
        userService.addUser(new User("hahaha", "123", "fjieow@fk", new Date()));
    }
}
