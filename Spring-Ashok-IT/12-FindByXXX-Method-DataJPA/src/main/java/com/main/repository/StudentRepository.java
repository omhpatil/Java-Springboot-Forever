package com.main.repository;

import com.main.entity.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    // findBy Method data

    // created method to find the records using gender
//    public List<Student> findByGender(String Gender);

    // created method to find the record using rank
//    public List<Student> findByRankGreaterThan(Long rank);

    // created method to find the record using rank
//    public List<Student> findByRankLessThan(Long rank);

    // created method to find student by gender = ? and rank >= 10
//    public List<Student> findByGenderAndRankGreaterThan(String Gender, Long Rank);

    // method for null gender records
//    public List<Student> findByGenderIsNull();


    // HQL and SQL (Native Query) data

    // SQL Query
//    @Query(value = "select * from student_table", nativeQuery = true)
//    public List<Student> getAllStudents();

    // HQL Query
//    @Query("from Student")
//    public List<Student> getStudents();

//    // method to get male student using gender
//    @Query("from Student where gender='male'")
//    public List<Student> getStudentByGender();

//    @Modifying
//    @Transactional
//    @Query("delete from Student where id = :id")
//    public void deleteStudent(Integer id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO student_table (stud_id, stud_name, stud_rank, stud_gender) " +
            "VALUES (:id, :name, :rank, :gender)",
            nativeQuery = true)
    public void insertStudent(Integer id, String name, Long rank, String gender);
}