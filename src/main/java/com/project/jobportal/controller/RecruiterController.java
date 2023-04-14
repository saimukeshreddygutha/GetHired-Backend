package com.project.jobportal.controller;


import com.project.jobportal.entity.JobAds;
import com.project.jobportal.entity.Recruiter;
import com.project.jobportal.repository.JobAdsRepository;
import com.project.jobportal.repository.RecruiterRepository;
import com.project.jobportal.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {

    @Autowired
    RecruiterRepository recruiterRepository;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    JobAdsRepository jobAdsRepository;

    @GetMapping("/get-id/{username}")
    public Long getJobSeekerId(@PathVariable String username){
        return recruiterRepository.findByUsername(username).orElse(null) != null ? recruiterRepository.findByUsername(username).get().getId() : -1;
    }
    @GetMapping("/{username}")
    public Recruiter getRecruiter(@PathVariable String username){
        return recruiterRepository.findByUsername(username).get();
    }

    @PostMapping("/add")
    public ResponseEntity<Recruiter> addRecruiter(@RequestBody Recruiter recruiter){
        recruiter.setId(sequenceGeneratorService.generateSequence(recruiter.SEQUENCE_NAME));
        recruiter.setCreatedDate(LocalDate.now());
        recruiterRepository.save(recruiter);
        return new ResponseEntity(recruiter, HttpStatus.CREATED);
    }

    @PostMapping("/{username}/job/add")
    public ResponseEntity<JobAds> addJobAd(@PathVariable String username, @RequestBody JobAds jobAds){

        Recruiter recruiter = recruiterRepository.findByUsername(username).get();
        jobAds.setJobId(sequenceGeneratorService.generateSequence(JobAds.SEQUENCE_NAME));
        jobAds.setRecruiterId(recruiter.getId());
        jobAds.setRecruiterUsername(username);
        jobAds.setCreatedDate(LocalDate.now());
        jobAdsRepository.save(jobAds);
        return new ResponseEntity(jobAds, HttpStatus.CREATED);
    }

    @GetMapping("/{username}/jobads/all")
    public List<JobAds> getRecruiterJobAds(@PathVariable String username){
        return  jobAdsRepository.findByRecruiterUsername(username);
    }

}
