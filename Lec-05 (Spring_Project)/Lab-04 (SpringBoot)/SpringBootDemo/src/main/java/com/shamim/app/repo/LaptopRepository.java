package com.shamim.app.repo;

import com.shamim.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void persist(Laptop laptop) {
        System.out.println("Laptop persisted into database");
    }
}
