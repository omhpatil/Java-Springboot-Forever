package com.main;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean, DisposableBean {

    public Motor() {
        System.out.println("Motor Contstrutor");
    }

    public void doWork() {
        System.out.println("Motor Pulling Water");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Motor Started");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Motor Stoped");
    }
}
