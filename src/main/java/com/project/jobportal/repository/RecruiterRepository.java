package com.project.jobportal.repository;

import com.project.jobportal.entity.Recruiter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecruiterRepository extends MongoRepository<Recruiter, Long> {
}
