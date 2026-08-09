package com.main;

import com.main.entity.Student;
import com.main.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        StudentRepository studentRepository = context.getBean(StudentRepository.class);

//        List<Student> maleStudents = studentRepository.findByGender("male");
//        maleStudents.forEach(System.out::println);

//        List<Student> greaterRankStudent = studentRepository.findByRankGreaterThan(10L);
//        greaterRankStudent.forEach(System.out::println);

//        List<Student> lessRankStudent = studentRepository.findByRankLessThan(15L);
//        lessRankStudent.forEach(System.out::println);

//        List<Student> byGenderAndRankGreaterThan = studentRepository.findByGenderAndRankGreaterThan("Male", 11L);
//        byGenderAndRankGreaterThan.forEach(System.out::println);

//        List<Student> students = studentRepository.getAllStudents();
//        students.forEach(System.out::println);


//        List<Student> students = studentRepository.getStudents();
//        students.forEach(System.out::println);

//        List<Student> students = studentRepository.getStudentByGender();
//        students.forEach(System.out::println);

//        studentRepository.deleteStudent(3);
//        System.out.println("Student Deleted....");

        studentRepository.insertStudent(3, "John", 123L, "Male");
        System.out.println("Student Inserted");
    }

}
