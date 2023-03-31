package com.project.jobportal.controller;


import com.project.jobportal.entity.*;
import com.project.jobportal.repository.JobSeekerEducationRepository;
import com.project.jobportal.repository.JobSeekerExperienceRepository;
import com.project.jobportal.repository.JobSeekerRepository;
import com.project.jobportal.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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

    @PostMapping("/add")
    public ResponseEntity<JobSeeker> addJobSeeker(@RequestBody JobSeeker jobSeeker){
        jobSeeker.setId(sequenceGeneratorService.generateSequence(jobSeeker.SEQUENCE_NAME));
        jobSeeker.setCreatedTime(LocalDate.now());
        jobSeekerRepository.save(jobSeeker);
        return new ResponseEntity(jobSeeker, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public JobSeeker getJobSeeker(@PathVariable long id) {
        return jobSeekerRepository.findById(id).orElse(null);
    }

    @GetMapping("/all")
    public List<JobSeeker> getAllJobSeekers(){
        return jobSeekerRepository.findAll();
    }

    @PostMapping("/{id}/add-edu")
    public ResponseEntity<JobSeekerEducation> addEducation(@PathVariable long id, @RequestBody List<Education> educationList){
        JobSeeker jobSeeker = getJobSeeker(id);
        if(jobSeeker == null)return new ResponseEntity(null, HttpStatus.BAD_REQUEST);

        JobSeekerEducation jobSeekerEducation = new JobSeekerEducation(id, educationList);
        educationRepository.save(jobSeekerEducation);
        return new ResponseEntity(jobSeekerEducation, HttpStatus.CREATED);
    }


    @PostMapping("/{id}/add-exp")
    public ResponseEntity<JobSeekerExperience> addExperience(@PathVariable long id, @RequestBody List<Experience> experienceList){
        JobSeeker jobSeeker = getJobSeeker(id);
        if(jobSeeker == null)return new ResponseEntity(null, HttpStatus.BAD_REQUEST);

        JobSeekerExperience jobSeekerExperience = new JobSeekerExperience(id, experienceList);
        experienceRepository.save(jobSeekerExperience);
        return new ResponseEntity(jobSeekerExperience, HttpStatus.CREATED);
    }
}
