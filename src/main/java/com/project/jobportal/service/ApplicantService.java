package com.project.jobportal.service;


import com.project.jobportal.entity.Applicant;
import com.project.jobportal.repository.ApplicantRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;
    public List<Applicant> getApplicantDetails(ObjectId id){
        return applicantRepository.findById(id);
    }
}
