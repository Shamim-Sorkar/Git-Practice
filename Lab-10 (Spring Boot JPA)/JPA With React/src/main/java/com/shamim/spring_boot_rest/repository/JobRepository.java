package com.shamim.spring_boot_rest.repository;

import com.shamim.spring_boot_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {
    public JobPost findByPostId(int postId);
    public List<JobPost> findByPostProfileContaining(String postProfile);
}



