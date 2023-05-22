package com.project.jobportal.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "job_application")
public class JobApplication {

    @Transient
    public static final String SEQUENCE_NAME = "job_application";

    @Id
    private Long id;

    private Long jobAdId;
    private Long jobSeekerId;

    private String jobSeekerUsername;

    private String companyName;
    private Long recruiterId;

    private String jobSeekerFullName;

    private String recruiterUsername;
    private List<Education> educationList;

    private List<Experience> experienceList;

    private String jobSeekerLocation;

    private String jobAdLocation;
    private String jobSeekerGender;

    private int jobSeekerAge;

    private String jobSeekerEmail;

    private String jobSeekerResumeLink;

    private LocalDate appliedDate;

    private String jobSeekerSkills;

    private String jobDescRequiredSkills;

    public Integer match;


    public JobApplication(Long id, Long jobAdId, Long jobSeekerId, String jobSeekerUsername, String companyName, Long recruiterId, String jobSeekerFullName, String recruiterUsername, List<Education> educationList, List<Experience> experienceList, String jobSeekerLocation, String jobAdLocation, String jobSeekerGender, int jobSeekerAge, String jobSeekerEmail, String jobSeekerResumeLink, LocalDate appliedDate, String jobSeekerSkills, String jobDescRequiredSkills, Integer match) {
        this.id = id;
        this.jobAdId = jobAdId;
        this.jobSeekerId = jobSeekerId;
        this.jobSeekerUsername = jobSeekerUsername;
        this.companyName = companyName;
        this.recruiterId = recruiterId;
        this.jobSeekerFullName = jobSeekerFullName;
        this.recruiterUsername = recruiterUsername;
        this.educationList = educationList;
        this.experienceList = experienceList;
        this.jobSeekerLocation = jobSeekerLocation;
        this.jobAdLocation = jobAdLocation;
        this.jobSeekerGender = jobSeekerGender;
        this.jobSeekerAge = jobSeekerAge;
        this.jobSeekerEmail = jobSeekerEmail;
        this.jobSeekerResumeLink = jobSeekerResumeLink;
        this.appliedDate = appliedDate;
        this.jobSeekerSkills = jobSeekerSkills;
        this.jobDescRequiredSkills = jobDescRequiredSkills;
        this.match = match;
    }

    public JobApplication() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobAdId() {
        return jobAdId;
    }

    public void setJobAdId(Long jobAdId) {
        this.jobAdId = jobAdId;
    }

    public Long getJobSeekerId() {
        return jobSeekerId;
    }

    public void setJobSeekerId(Long jobSeekerId) {
        this.jobSeekerId = jobSeekerId;
    }

    public String getJobSeekerUsername() {
        return jobSeekerUsername;
    }

    public void setJobSeekerUsername(String jobSeekerUsername) {
        this.jobSeekerUsername = jobSeekerUsername;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getRecruiterId() {
        return recruiterId;
    }

    public void setRecruiterId(Long recruiterId) {
        this.recruiterId = recruiterId;
    }

    public String getJobSeekerFullName() {
        return jobSeekerFullName;
    }

    public void setJobSeekerFullName(String jobSeekerFullName) {
        this.jobSeekerFullName = jobSeekerFullName;
    }

    public String getRecruiterUsername() {
        return recruiterUsername;
    }

    public void setRecruiterUsername(String recruiterUsername) {
        this.recruiterUsername = recruiterUsername;
    }

    public List<Education> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public String getJobSeekerLocation() {
        return jobSeekerLocation;
    }

    public void setJobSeekerLocation(String jobSeekerLocation) {
        this.jobSeekerLocation = jobSeekerLocation;
    }

    public String getJobAdLocation() {
        return jobAdLocation;
    }

    public void setJobAdLocation(String jobAdLocation) {
        this.jobAdLocation = jobAdLocation;
    }

    public String getJobSeekerGender() {
        return jobSeekerGender;
    }

    public void setJobSeekerGender(String jobSeekerGender) {
        this.jobSeekerGender = jobSeekerGender;
    }

    public int getJobSeekerAge() {
        return jobSeekerAge;
    }

    public void setJobSeekerAge(int jobSeekerAge) {
        this.jobSeekerAge = jobSeekerAge;
    }

    public String getJobSeekerEmail() {
        return jobSeekerEmail;
    }

    public void setJobSeekerEmail(String jobSeekerEmail) {
        this.jobSeekerEmail = jobSeekerEmail;
    }

    public String getJobSeekerResumeLink() {
        return jobSeekerResumeLink;
    }

    public void setJobSeekerResumeLink(String jobSeekerResumeLink) {
        this.jobSeekerResumeLink = jobSeekerResumeLink;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getJobSeekerSkills() {
        return jobSeekerSkills;
    }

    public void setJobSeekerSkills(String jobSeekerSkills) {
        this.jobSeekerSkills = jobSeekerSkills;
    }

    public String getJobDescRequiredSkills() {
        return jobDescRequiredSkills;
    }

    public void setJobDescRequiredSkills(String jobDescRequiredSkills) {
        this.jobDescRequiredSkills = jobDescRequiredSkills;
    }

    public Integer getMatch() {
        return match;
    }

    public void setMatch(Integer match) {
        this.match = match;
    }
}
