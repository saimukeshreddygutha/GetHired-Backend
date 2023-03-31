package com.project.jobportal.controller;


import com.project.jobportal.entity.Admin;
import com.project.jobportal.entity.JobAds;
import com.project.jobportal.entity.JobSeeker;
import com.project.jobportal.entity.Recruiter;
import com.project.jobportal.repository.AdminRepository;
import com.project.jobportal.repository.JobAdsRepository;
import com.project.jobportal.repository.JobSeekerRepository;
import com.project.jobportal.repository.RecruiterRepository;
import com.project.jobportal.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    JobSeekerRepository jobSeekerRepository;
    @Autowired
    AdminRepository adminRepository;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    RecruiterRepository recruiterRepository;

    @Autowired
    JobAdsRepository jobAdsRepository;

    @GetMapping("/{id}")
    public Admin getAdminDetails(@PathVariable Long id){
        return adminRepository.findById(id).orElse(null);
    }

    @GetMapping("/all-jobseeker")
    public List<JobSeeker> getAllJobSeekers(){
        return jobSeekerRepository.findAll();
    }


    @PostMapping("/add")
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin){
        admin.setId(sequenceGeneratorService.generateSequence(admin.SEQUENCE_NAME));

        admin.setCreatedDate(LocalDate.now());
        adminRepository.save(admin);

        return new ResponseEntity(admin, HttpStatus.CREATED);
    }

    @GetMapping("/all-recruiter")
    public List<Recruiter> getAllRecruiter(){
        return recruiterRepository.findAll();
    }

    @GetMapping("/all-ads")
    public List<JobAds> getAllAds(){
        return jobAdsRepository.findAll();
    }

}
