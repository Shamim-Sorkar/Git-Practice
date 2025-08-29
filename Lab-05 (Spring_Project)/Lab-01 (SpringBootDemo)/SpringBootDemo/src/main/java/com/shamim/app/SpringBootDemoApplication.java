package com.shamim.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {
	public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);

        Alien obj1 = context.getBean(Alien.class);
        obj1.code();
	}
}
