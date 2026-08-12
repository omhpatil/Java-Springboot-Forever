package com.main;

import com.main.entity.Student;
import com.main.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        StudentRepository studentRepository = context.getBean(StudentRepository.class);

//        Student student = new Student(1, "Om", 121L, "Male", "Y");

        Student student = studentRepository.findById(1).get();
        student.setActiveSW("N");

        studentRepository.save(student);

    }
}
