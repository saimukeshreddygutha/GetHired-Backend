package com.project.jobportal.controller;


import com.project.jobportal.entity.*;
import com.project.jobportal.repository.*;
import com.project.jobportal.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("jobseeker")
public class JobSeekerController {

    @Autowired
    private JobSeekerRepository jobSeekerRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    private JobSeekerEducationRepository educationRepository;

    @Autowired
    private JobSeekerExperienceRepository experienceRepository;

    @Autowired
    private JobApplicatonRepository jobApplicatonRepository;

    @Autowired
    private JobAdsRepository jobAdsRepository;


    @GetMapping("/get-id/{username}")
    public Long getJobSeekerId(@PathVariable String username){
        return jobSeekerRepository.findByUsername(username).orElse(null) != null ? jobSeekerRepository.findByUsername(username).get().getId() : -1;
    }


    @PostMapping("/add")
    public ResponseEntity<JobSeeker> addJobSeeker(@RequestBody JobSeeker jobSeeker){
        jobSeeker.setId(sequenceGeneratorService.generateSequence(jobSeeker.SEQUENCE_NAME));
        jobSeeker.setCreatedTime(LocalDate.now());
        jobSeekerRepository.save(jobSeeker);
        return new ResponseEntity(jobSeeker, HttpStatus.CREATED);
    }

    @GetMapping("/id/{id}")
    public JobSeeker getJobSeekerById(@PathVariable long id) {
        return jobSeekerRepository.findById(id).orElse(null);
    }

    @GetMapping("/username/{username}")
    public JobSeeker getJobSeekerByUsername(@PathVariable String username) {
        return jobSeekerRepository.findByUsername(username).orElse(null);
    }

    @GetMapping("/all")
    public List<JobSeeker> getAllJobSeekers(){
        return jobSeekerRepository.findAll();
    }

    @PostMapping("/{username}/edu/add")
    public ResponseEntity<JobSeekerEducation> addEducation(@PathVariable String username, @RequestBody List<Education> educationList){
        JobSeeker jobSeeker = getJobSeekerByUsername(username);
        if(jobSeeker == null)return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        if(educationRepository.findByUsername(username) != null)educationRepository.deleteByUsername(username);
        JobSeekerEducation jobSeekerEducation = new JobSeekerEducation(jobSeeker.getId(), username, educationList);
        educationRepository.save(jobSeekerEducation);
        return new ResponseEntity(jobSeekerEducation, HttpStatus.CREATED);
    }


    @PostMapping("/{username}/exp/add")
    public ResponseEntity<JobSeekerExperience> addExperience(@PathVariable String username, @RequestBody List<Experience> experienceList){
        JobSeeker jobSeeker = getJobSeekerByUsername(username);
        if(jobSeeker == null)return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        if(experienceRepository.findByUsername(username) != null)experienceRepository.deleteByUsername(username);
        JobSeekerExperience jobSeekerExperience = new JobSeekerExperience(jobSeeker.getId(), username, experienceList);
        experienceRepository.save(jobSeekerExperience);
        return new ResponseEntity(jobSeekerExperience, HttpStatus.CREATED);
    }

    @GetMapping("/{username}/applied")
    public List<JobApplication> getApplicationsForJobSeeker(@PathVariable String username){
        return jobApplicatonRepository.findByJobSeekerUsername(username);
    }

    @GetMapping("/{username}/jobads")
    public List<JobAds> getAllJobAds(@PathVariable String username){
        return jobAdsRepository.findAll();
    }

    @GetMapping("/{username}/edu/get")
    public List<Education> getEducationList(@PathVariable String username){
        JobSeekerEducation jobSeekerEducation = educationRepository.findByUsername(username);
        if(jobSeekerEducation == null)return new ArrayList<Education>();
        return jobSeekerEducation.getEducationDetails();
    }
}
