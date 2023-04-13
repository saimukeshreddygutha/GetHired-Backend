package com.project.jobportal.repository;

import com.project.jobportal.entity.Experience;
import com.project.jobportal.entity.JobSeekerExperience;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobSeekerExperienceRepository extends MongoRepository<JobSeekerExperience, Long> {

    JobSeekerExperience findByUsername(String username);
    void deleteByUsername(String username);
}
