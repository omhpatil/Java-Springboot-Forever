package com.main;

import com.main.entity.Student;
import com.main.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        StudentRepository studentRepository = context.getBean(StudentRepository.class);

//        Student s = new Student();
//        s.setId(1);
//        s.setName("Om");
//        s.setRank(11L);
//        s.setGender("Male");
//
//        studentRepository.save(s);
//        System.out.println("Student Record Inserted.......");

//        // to data retrivel by id
//        Optional<Student> optional = studentRepository.findById(1);
//        optional.ifPresent(System.out::println);

        // find all records
//        Iterable<Student> findAll = studentRepository.findAll();
//        findAll.forEach(System.out::println);

//        // delete record
        if (studentRepository.existsById(2)) {
            studentRepository.deleteById(2);
        } else {
            System.out.println("Record Not Found");
        }

        
//        System.out.println(studentRepository.getClass().getName());             // jdk.proxy2.$Proxy101
    }

}
