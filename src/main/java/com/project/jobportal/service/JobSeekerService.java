package com.project.jobportal.service;


import com.project.jobportal.entity.JobSeeker;
import com.project.jobportal.repository.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerService {


    @Autowired
    JobSeekerRepository jobSeekerRepository;

    public Long getJobSeekerIdByUsername(String username){
        return jobSeekerRepository.
                findByUsername(username).isPresent() ? jobSeekerRepository.findByUsername(username).get().getId() : -1;
    }
}
