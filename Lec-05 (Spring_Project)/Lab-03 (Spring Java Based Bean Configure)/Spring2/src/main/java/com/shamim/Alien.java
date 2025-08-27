package com.shamim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("Sorkar")
    private String name = "Shamim";
    @Autowired
    @Qualifier("laptop")
    private Computer comp;

    public Alien() {
        System.out.println("Alien Object created");
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return  "\nFrom toString\n" + name + " " + comp.print();
    }
}
