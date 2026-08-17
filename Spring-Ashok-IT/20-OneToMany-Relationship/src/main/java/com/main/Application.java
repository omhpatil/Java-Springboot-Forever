package com.main;

import com.main.entity.Address;
import com.main.entity.Employee;
import com.main.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);

        Employee e = new Employee();
        e.setEmpName("Viru");
        e.setEmpSalary(1243.0);

        Address a = new Address();
        a.setCity("Pune");
        a.setState("Maharashtra");
        a.setCountry("India");
        a.setEmp(e);

        Address a1 = new Address();
        a1.setCity("Pune");
        a1.setState("Maharashtra");
        a1.setCountry("India");
        a1.setEmp(e);

        // setting address to employee
        List<Address> addressList = Arrays.asList(a, a1);
        e.setAddress(addressList);

        employeeRepository.save(e);
        System.out.println("Records Inserted..");
    }
}