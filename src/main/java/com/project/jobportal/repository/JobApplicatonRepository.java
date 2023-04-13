package com.project.jobportal.repository;

import com.project.jobportal.entity.JobApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface JobApplicatonRepository extends MongoRepository<JobApplication, Long> {

    List<JobApplication> findByJobSeekerId(Long id);
}
