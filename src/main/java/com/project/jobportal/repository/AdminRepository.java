package com.project.jobportal.repository;

import com.project.jobportal.entity.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, Long> {
}
