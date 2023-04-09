package com.project.jobportal.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

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

    private String location;
    private String jobSeekerGender;

    private String jobSeekerAge;

    private String jobSeekerEmail;

    private String jobSeekerResumeLink;

    public JobApplication() {
    }

    public JobApplication(Long id, Long jobAdId, Long jobSeekerId, String jobSeekerUsername, String companyName, Long recruiterId, String jobSeekerFullName, String recruiterUsername, List<Education> educationList, List<Experience> experienceList, String location, String jobSeekerGender, String jobSeekerAge, String jobSeekerEmail, String jobSeekerResumeLink) {
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
        this.location = location;
        this.jobSeekerGender = jobSeekerGender;
        this.jobSeekerAge = jobSeekerAge;
        this.jobSeekerEmail = jobSeekerEmail;
        this.jobSeekerResumeLink = jobSeekerResumeLink;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobSeekerGender() {
        return jobSeekerGender;
    }

    public void setJobSeekerGender(String jobSeekerGender) {
        this.jobSeekerGender = jobSeekerGender;
    }

    public String getJobSeekerAge() {
        return jobSeekerAge;
    }

    public void setJobSeekerAge(String jobSeekerAge) {
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
}
