package com.robertramirez.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.robertramirez.springapp.aop.TestAOP;

public class MainApp {
    public static void main(String[] args){
        
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        TestAOP testAop = applicationContext.getBean(TestAOP.class);
        testAop.performSomeTask();
    }
}
