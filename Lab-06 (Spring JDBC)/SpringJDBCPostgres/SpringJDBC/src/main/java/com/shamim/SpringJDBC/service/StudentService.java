package com.shamim.SpringJDBC.service;

import com.shamim.SpringJDBC.model.Student;
import com.shamim.SpringJDBC.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository repository;

    public StudentRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student s) {
        repository.save(s);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }
}
