package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Motor motor = context.getBean(Motor.class);
        motor.doWork();

        context.close();

    }
}
