package com.shamim.app.service;

import com.shamim.app.model.Laptop;
import com.shamim.app.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void add(Laptop laptop) {
        repo.persist(laptop);
    }
}
