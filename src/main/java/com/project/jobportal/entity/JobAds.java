package com.project.jobportal.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document(collection = "job_ads")
public class JobAds {

    @Transient
    public static final String SEQUENCE_NAME = "job_ads";

    @Id
    private Long jobId;

    private Long recruiterId;

    private String companyName;

    private String description;

    private String roleName;

    private String location;

    private LocalDate createdDate;

    public JobAds() {
    }

    public JobAds(Long jobId, Long recruiterId, String companyName, String description, String roleName, String location, LocalDate createdDate) {
        this.jobId = jobId;
        this.recruiterId = recruiterId;
        this.companyName = companyName;
        this.description = description;
        this.roleName = roleName;
        this.location = location;
        this.createdDate = createdDate;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getRecruiterId() {
        return recruiterId;
    }

    public void setRecruiterId(Long recruiterId) {
        this.recruiterId = recruiterId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
