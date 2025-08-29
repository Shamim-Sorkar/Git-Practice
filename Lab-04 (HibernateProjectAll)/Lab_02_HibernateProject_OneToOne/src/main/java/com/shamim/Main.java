package com.shamim;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Samsung");
        l1.setModel("Core i5");
        l1.setRam(8);

        Alien a1 = new Alien();
        a1.setId(192);
        a1.setName("Wow");
        a1.setTech("Java");
        a1.setLaptop(l1);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.shamim.Laptop.class);
        cfg.addAnnotatedClass(com.shamim.Alien.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(a1);
        transaction.commit();

        Alien a2 = session.getReference(Alien.class, a1.getId());
        System.out.println(a2.toString());

        session.close();
        sf.close();
    }
}