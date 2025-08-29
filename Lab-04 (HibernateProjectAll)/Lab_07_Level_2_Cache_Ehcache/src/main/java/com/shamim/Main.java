package com.shamim;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.shamim.Laptop.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Laptop l1 = session.getReference(com.shamim.Laptop.class,1);
        System.out.println(l1);
        Laptop l2 = session.getReference(com.shamim.Laptop.class,1);
        System.out.println(l2);

        session.close();

        Session session2 = sf.openSession();

        Laptop l3 = session2.getReference(com.shamim.Laptop.class,1);
        System.out.println(l3);

        session2.close();


        sf.close();
    }
}