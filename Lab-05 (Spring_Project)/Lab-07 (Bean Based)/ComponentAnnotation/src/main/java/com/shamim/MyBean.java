package com.shamim;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MyBean {
    public MyBean() {
        System.out.println("MyBean Created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean customized after init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cleaning completed Before bean destroy");
    }
}
