package com.main.beans;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    public UserDAO() {
        System.out.println("UserDAO Constructor");
    }
}
