package com.project.jobportal.repository;

import com.project.jobportal.entity.JobSeeker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobSeekerRepository extends MongoRepository<JobSeeker, Long> {
}
