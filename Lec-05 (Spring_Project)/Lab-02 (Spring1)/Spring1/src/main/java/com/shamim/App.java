package com.shamim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// create container

        Alien obj = context.getBean ("alien", Alien.class);
        System.out.println(obj);
    }
}
