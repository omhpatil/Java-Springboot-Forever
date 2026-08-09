package com.main;

import com.beans.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        System.out.println("BeanFactory Created");

//        Car car = bf.getBean(Car.class);
//        car.drive();
    }
}