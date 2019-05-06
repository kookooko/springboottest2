package com.lu.web.controller;

import com.lu.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("stu")
public class StudentController {
    @RequestMapping("list")
    public String show(Model model) {
        model.addAttribute("username", "zhangsan");
        model.addAttribute("age", 90);
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "wangwu", "male"));
        studentList.add(new Student(2, "zhaoliu", "female"));
        studentList.add(new Student(3, "liqi", "male"));
        model.addAttribute("studentList", studentList);
        return "stu/list";
    }
}
