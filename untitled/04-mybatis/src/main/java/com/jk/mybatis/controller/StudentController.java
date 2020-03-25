package com.jk.mybatis.controller;

import com.jk.mybatis.bean.Student;
import com.jk.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> selectAllStudent() {

        return studentService.selectAllStudent();

    }
}
