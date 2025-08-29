package com.shamim;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Object created");
    }

    public String print() {
        return "Laptop Object Printing";
    }
}
