package com.shamim.spring_data_rest_demo.repository;


import com.shamim.spring_data_rest_demo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {

}

