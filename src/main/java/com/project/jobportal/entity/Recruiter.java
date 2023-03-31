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

    private String getUserName;

    private String email;

    private LocalDate createdDate;

    public Recruiter() {
    }

    public Recruiter(Long id, String companyName, String getUserName, String email, LocalDate createdDate) {
        this.id = id;
        this.companyName = companyName;
        this.getUserName = getUserName;
        this.email = email;
        this.createdDate = createdDate;
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

    public String getGetUserName() {
        return getUserName;
    }

    public void setGetUserName(String getUserName) {
        this.getUserName = getUserName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
