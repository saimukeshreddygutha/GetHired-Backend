package com.project.jobportal.service;


import com.project.jobportal.entity.*;
import com.project.jobportal.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JobApplicationService {

    @Autowired
    JobAdsRepository jobAdsRepository;

    @Autowired
    JobSeekerRepository jobSeekerRepository;

    @Autowired
    JobSeekerExperienceRepository experienceRepository;

    @Autowired
    JobSeekerEducationRepository educationRepository;

    @Autowired
    JobApplicatonRepository applicatonRepository;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    JobSeekerService jobSeekerService;

    public JobApplication applyForJobAd(String username, Long jobAdId, Integer match){

        JobSeeker jobSeeker = jobSeekerRepository.findByUsername(username).get();
        JobAds jobAds = jobAdsRepository.findById(jobAdId).get();
        JobSeekerEducation jobSeekerEducation = educationRepository.findByUsername(username);
        JobSeekerExperience jobSeekerExperience = experienceRepository.findByUsername(username);
        JobApplication jobApplication = new JobApplication();
        jobApplication.setJobAdId(jobAdId);
        jobApplication.setJobSeekerId(jobSeeker.getId());
        jobApplication.setJobSeekerEmail(jobSeeker.getEmail());
        jobApplication.setJobSeekerAge(jobSeeker.getAge());
        jobApplication.setJobSeekerGender(jobSeeker.getGender());
        jobApplication.setJobSeekerUsername(username);
        jobApplication.setCompanyName(jobAds.getCompanyName());
        jobApplication.setEducationList(jobSeekerEducation.getEducationDetails());
        jobApplication.setExperienceList(jobSeekerExperience.getExperienceList());
        jobApplication.setRecruiterId(jobAds.getRecruiterId());
        jobApplication.setRecruiterUsername(jobAds.getRecruiterUsername());
        jobApplication.setJobSeekerResumeLink(jobSeeker.getResumeLink());
        jobApplication.setJobAdLocation(jobAds.getLocation());
        jobApplication.setJobSeekerLocation(jobSeeker.getLocation());
        jobApplication.setAppliedDate(LocalDate.now());
        jobApplication.setJobSeekerFullName(jobSeeker.getName());
        jobApplication.setId(sequenceGeneratorService.generateSequence(JobApplication.SEQUENCE_NAME));
        jobApplication.setJobSeekerSkills(jobSeeker.getSkills());
        jobApplication.setJobDescRequiredSkills(jobAds.getSkillsRequired());
        jobApplication.setMatch(match);
        applicatonRepository.save(jobApplication);

        return jobApplication;

    }
}
