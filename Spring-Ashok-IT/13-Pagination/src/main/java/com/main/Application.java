package com.main;

import com.main.entity.Student;
import com.main.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        StudentRepository studentRepository = context.getBean(StudentRepository.class);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Page Number: ");

        int pageNo = scanner.nextInt();
        int pageSize = 3;

        // page num will start from the 0
        PageRequest pageRequest = PageRequest.of(pageNo - 1, pageSize);
        Page<Student> page = studentRepository.findAll(pageRequest);
        List<Student> student = page.getContent();
        student.forEach(System.out::println);

    }
}