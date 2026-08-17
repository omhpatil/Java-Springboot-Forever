package com.main;

import com.main.entity.Student;
import com.main.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(Application.class, args);

        StudentRepository studentRepository =
                context.getBean(StudentRepository.class);

        System.out.println(context.getBean(javax.sql.DataSource.class));

        Student s1 = new Student();
        s1.setName("Om");
        s1.setGender("Male");

        Student s2 = new Student();
        s2.setName("Rahul");
        s2.setGender("Male");

        Student s3 = new Student();
        s3.setName("Priya");
        s3.setGender("Female");

        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.save(s3);

        System.out.println(studentRepository.findAll());
    }
}