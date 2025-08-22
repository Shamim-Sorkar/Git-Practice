package com.shamim;

import com.shamim.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1);




//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// create container
//
//        Alien obj1 = context.getBean ("alien", Alien.class);
//        System.out.println(obj1);
    }
}
