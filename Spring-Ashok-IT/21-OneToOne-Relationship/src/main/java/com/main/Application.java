package com.main;

import com.main.entity.Passport;
import com.main.entity.Person;
import com.main.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        PersonRepository personRepository = context.getBean(PersonRepository.class);

//        Person p = new Person();
//        p.setPersonName("Viru");
//        p.setPersonGender("Male");
//
//        Passport ps = new Passport();
//        ps.setPassportNum("54321");
//        ps.setIssueDate(LocalDate.now());
//        ps.setExpiryDate(LocalDate.now().plusYears(10));
//        ps.setPerson(p);
//
//        p.setPassport(ps);
//        personRepository.save(p);
//        System.out.println("Record Saved...");

        personRepository.deleteById(2);
        System.out.println("Record Deleted");
    }
}