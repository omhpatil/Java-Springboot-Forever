package com.main.repository;

import com.main.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    List<Student> findByActiveSW(String activeSW);

}
