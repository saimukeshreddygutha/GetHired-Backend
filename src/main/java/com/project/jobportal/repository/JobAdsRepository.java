package com.project.jobportal.repository;

import com.project.jobportal.entity.JobAds;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobAdsRepository extends MongoRepository<JobAds, Long> {
}
