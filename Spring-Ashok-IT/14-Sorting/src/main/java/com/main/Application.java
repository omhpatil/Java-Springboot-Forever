package com.main;

import com.main.entity.Student;
import com.main.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        StudentRepository studentRepository = context.getBean(StudentRepository.class);

        List<Student> students = studentRepository.findAll(Sort.by("name"));
        students.forEach(System.out::println);
    }
}