package com.shamim.JobApp.service;

import com.shamim.JobApp.model.JobPost;
import com.shamim.JobApp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository repository;

    public void addJob(JobPost job) {
        repository.addJob(job);
    }

    public List<JobPost> getAllJobs() {
        return repository.getAllJobs();
    }
}
