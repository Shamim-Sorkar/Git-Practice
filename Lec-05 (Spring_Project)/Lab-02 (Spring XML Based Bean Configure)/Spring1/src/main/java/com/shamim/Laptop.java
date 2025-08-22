package com.shamim;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Object created");
    }

    public String print() {
        return "Laptop";
    }
}
