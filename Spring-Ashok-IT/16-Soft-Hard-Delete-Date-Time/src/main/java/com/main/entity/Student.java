package com.main.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.generator.EventType;

import java.time.LocalDateTime;

@Entity
@Table(name = "student_table")
public class Student {

    public Student() {

    }

    public Student(Integer id, String name, Long rank, String gender, String activeSW) {
        this.id = id;
        this.name = name;
        Rank = rank;
        this.gender = gender;
        this.activeSW = activeSW;
    }

    @Id
    @Column(name = "stud_id")
    private Integer id;

    @Column(name = "stud_name")
    private String name;

    @Column(name = "stud_rank")
    private Long Rank;

    @Column(name = "stud_gender")
    private String gender;

    @Column(name = "active_sw")
    private String activeSW;

    @CreationTimestamp
    @Column(name = "created_date", updatable = false)
    private LocalDateTime createDate;

    @CurrentTimestamp(event = EventType.UPDATE)
    @Column(name = "updated_date")
    private LocalDateTime updatedTime;

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRank() {
        return Rank;
    }

    public void setRank(Long rank) {
        Rank = rank;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActiveSW() {
        return activeSW;
    }

    public void setActiveSW(String activeSW) {
        this.activeSW = activeSW;
    }
}


//INSERT
//│
//        ├── created_date → automatically generated ✅
//        │
//        └── updated_date → NULL initially ✅

//UPDATE
//│
//        ├── created_date → remains unchanged ✅
//        │
//        └── updated_date → automatically generated/updated ✅

// But for checking insert u need to change (UPDATE -> CREATE) in application.properties and vice-versa