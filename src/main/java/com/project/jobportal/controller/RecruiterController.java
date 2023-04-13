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

    @GetMapping("/{id}")
    public Recruiter getRecruiter(@PathVariable Long id){
        return recruiterRepository.findById(id).orElse(null);
    }

    @PostMapping("/add")
    public ResponseEntity<Recruiter> addRecruiter(@RequestBody Recruiter recruiter){
        recruiter.setId(sequenceGeneratorService.generateSequence(recruiter.SEQUENCE_NAME));
        recruiter.setCreatedDate(LocalDate.now());
        recruiterRepository.save(recruiter);
        return new ResponseEntity(recruiter, HttpStatus.CREATED);
    }

    @PostMapping("/{id}/job/add")
    public ResponseEntity<JobAds> addJobAd(@PathVariable Long id, @RequestBody JobAds jobAds){
        jobAds.setJobId(sequenceGeneratorService.generateSequence(JobAds.SEQUENCE_NAME));
        jobAdsRepository.save(jobAds);
        return new ResponseEntity(jobAds, HttpStatus.CREATED);
    }

}
