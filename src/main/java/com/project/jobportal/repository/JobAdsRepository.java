package com.project.jobportal.repository;

import com.project.jobportal.entity.JobAds;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;


public interface JobAdsRepository extends MongoRepository<JobAds, Long> {

    List<JobAds> findByRecruiterUsername(String recruiterUsername);
}
