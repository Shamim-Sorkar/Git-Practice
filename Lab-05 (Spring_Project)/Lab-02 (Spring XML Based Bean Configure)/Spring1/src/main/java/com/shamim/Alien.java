package com.shamim;

public class Alien {
    private String name;
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
