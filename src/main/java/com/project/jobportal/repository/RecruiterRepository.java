package com.project.jobportal.repository;

import com.project.jobportal.entity.Recruiter;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RecruiterRepository extends MongoRepository<Recruiter, Long> {

    Optional<Recruiter> findByUsername(String username);
}
