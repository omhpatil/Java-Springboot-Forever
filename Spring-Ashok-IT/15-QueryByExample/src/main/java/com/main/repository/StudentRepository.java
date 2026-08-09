package com.main.repository;

import com.main.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
