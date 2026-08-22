package com.main.controller;

import com.main.entity.Student;
import com.main.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students2")
public class StudentController2 {

    private final StudentService studentService;

    public StudentController2(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id) {

        return studentService.getStudentById(id);
    }
}