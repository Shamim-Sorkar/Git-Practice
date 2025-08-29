package com.shamim;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.shamim.Laptop.class);
        cfg.addAnnotatedClass(com.shamim.Alien.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        // SQL: select * from Laptop where ram = 32;
        // HQL: from Laptop where ram = 32;

        //Query query = session.createQuery("from Laptop where ram = 8");

        String cur_model = "Core i7";
        Query query = session.createQuery("select brand, model from Laptop where model like ?1");
        query.setParameter(1, cur_model);
        List<Object[]> laptops = query.getResultList();

        for (Object[] laptop : laptops) {
            System.out.print("Brand: " + (String) laptop[0]);
            System.out.println(", Model: " + (String) laptop[1]);
        }

        session.close();
        sf.close();
    }
}