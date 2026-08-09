package com.main;


import com.main.beans.Motor;
import com.main.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Motor m1 = context.getBean(Motor.class);
        System.out.println(m1.hashCode());

        Motor m2 = context.getBean(Motor.class);
        System.out.println(m2.hashCode());

    }
}
