package com.main;

import com.main.entity.Student;
import com.main.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        StudentRepository studentRepository = context.getBean(StudentRepository.class);

//        Student students = new Student(2, "Shiv", 111L, "Male", "N");

//        Student student = studentRepository.findById(1).get();
//        student.setActiveSW("N");

//        studentRepository.save(students);

        List<Student> student = studentRepository.findByActiveSW("Y");
        student.forEach(System.out::println);

    }
}
