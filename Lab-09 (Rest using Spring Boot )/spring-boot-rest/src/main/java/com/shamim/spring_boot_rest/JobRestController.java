package com.shamim.spring_boot_rest;

import com.shamim.spring_boot_rest.model.JobPost;
import com.shamim.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {
    @Autowired
    private JobService service;

    @GetMapping(path="jobPosts", produces={"application/json"})
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
        return service.getJob(postId);
    }

    @PostMapping(path="jobPost", consumes={"application/xml"})
    public JobPost addJob(@RequestBody JobPost job) {
        service.addJob(job);
        return service.getJob(job.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost job) {
        service.updateJob(job);
        System.out.println("From putting: " + service.getJob(job.getPostId()));
        return service.getJob(job.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return "Deleted: " + postId;
    }
 }
