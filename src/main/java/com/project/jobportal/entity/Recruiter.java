package com.project.jobportal.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "recruiter")
public class Recruiter {

    @Transient
    public static final String SEQUENCE_NAME = "recruiter";

    @Id
    private Long id;

    private String companyName;

    private String recruiterName;
    private String phone;
    private String username;

    private String email;

    private int numberOfJobAdsPosted;

    private LocalDate createdDate;

    private boolean isBlocked;

    public Recruiter(Long id, String companyName, String recruiterName, String phone, String username, String email, LocalDate createdDate) {
        this.id = id;
        this.companyName = companyName;
        this.recruiterName = recruiterName;
        this.phone = phone;
        this.username = username;
        this.email = email;
        this.numberOfJobAdsPosted = 0;
        this.createdDate = createdDate;
        this.isBlocked = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRecruiterName() {
        return recruiterName;
    }

    public void setRecruiterName(String recruiterName) {
        this.recruiterName = recruiterName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfJobAdsPosted() {
        return numberOfJobAdsPosted;
    }

    public void setNumberOfJobAdsPosted(int numberOfJobAdsPosted) {
        this.numberOfJobAdsPosted = numberOfJobAdsPosted;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
