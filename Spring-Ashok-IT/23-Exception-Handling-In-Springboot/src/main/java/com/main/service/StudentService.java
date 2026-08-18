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

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Om");
        s1.setGender("Male");

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Diksha");
        s2.setGender("Female");

        students.add(s1);
        students.add(s2);
    }

    public Student getStudent(Integer id) {

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