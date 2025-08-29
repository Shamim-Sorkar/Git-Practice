package com.shamim.spring_boot_rest.service;


import com.shamim.spring_boot_rest.model.JobPost;
import com.shamim.spring_boot_rest.repository.JobRepository;
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

    public JobPost getJob(int postId) {
        return repository.getJob(postId);
    }

    public void updateJob(JobPost job) {
        repository.updateJob(job);
    }

    public void deleteJob(int postId) {
        repository.deleteJob(postId);
    }
}
