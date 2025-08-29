package com.shamim;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Samsung");
        l1.setModel("Core i5");
        l1.setRam(8);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("HP");
        l2.setModel("Core i5");
        l2.setRam(8);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("DELL");
        l3.setModel("Core i5");
        l3.setRam(16);

        Alien a1 = new Alien();
        a1.setId(192);
        a1.setName("Monir");
        a1.setTech("Java");

        Alien a2 = new Alien();
        a2.setId(182);
        a2.setName("Jakir");
        a2.setTech("C++");

        Alien a3 = new Alien();
        a3.setId(170);
        a3.setName("Karim");
        a3.setTech("C");

        a1.setLaptops(Arrays.asList(l1, l2));
        a2.setLaptops(Arrays.asList(l2, l3));
        a3.setLaptops(Arrays.asList(l1));

        l1.setAliens(Arrays.asList(a1, a3));
        l2.setAliens(Arrays.asList(a1, a2));
        l3.setAliens(Arrays.asList(a2));

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.shamim.Laptop.class);
        cfg.addAnnotatedClass(com.shamim.Alien.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(a1);
        session.persist(a2);
        session.persist(a3);
        transaction.commit();

        Alien a5 = session.getReference(Alien.class, a2.getId());
        System.out.println(a5.toString());

        session.close();
        sf.close();
    }
}