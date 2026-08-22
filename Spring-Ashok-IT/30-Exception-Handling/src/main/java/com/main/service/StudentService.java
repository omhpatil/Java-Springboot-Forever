package com.main.service;

import com.main.entity.Student;
import com.main.exception.StudentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Om", "Male"));
        students.add(new Student(2, "Shiv", "Male"));
        students.add(new Student(3, "Diksha", "Female"));
    }

    public Student getStudentById(Integer id) {

        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new StudentNotFoundException(
                                "Student not found with id: " + id
                        )
                );
    }
}