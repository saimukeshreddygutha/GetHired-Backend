package com.project.jobportal.repository;

import com.project.jobportal.entity.JobSeeker;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface JobSeekerRepository extends MongoRepository<JobSeeker, Long> {
    Optional<JobSeeker> findByUsername(String username);
    Optional<JobSeeker> findByName(String name);
}
