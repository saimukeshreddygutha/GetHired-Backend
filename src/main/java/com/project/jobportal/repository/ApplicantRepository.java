package com.project.jobportal.repository;


import com.project.jobportal.entity.Applicant;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends MongoRepository<Applicant, ObjectId> {

}
