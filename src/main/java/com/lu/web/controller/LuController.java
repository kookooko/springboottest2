package com.lu.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class LuController {
    @RequestMapping("/nihao/{id}")
    @ResponseBody
    public Integer hello(@PathVariable Integer id) {
        return id;
    }

    /*public static void main(String[] args) {
        SpringApplication.run(LuController.class,args);
    }*/
}
