package com.shamim;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop Object created");
    }

    public String print() {
        return "Desktop";
    }
}
