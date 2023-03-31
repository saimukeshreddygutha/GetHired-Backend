package com.project.jobportal.repository;

import com.project.jobportal.entity.JobSeekerEducation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobSeekerEducationRepository extends MongoRepository<JobSeekerEducation, Long> {
}
