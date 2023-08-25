package com.project.jobportal.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "jobseeker")
public class JobSeeker {

    @Transient
    public static final String SEQUENCE_NAME = "jobseeker";

    @Id
    private Long id;
    private String name;
    private int age;
    private String email;

    private String gender;

    private LocalDate createdTime;

    private LocalDate dateOfBirth;

    private String location;

    private String username;

    private boolean isBlocked;

    private boolean educationDetailsPresent;

    private int numberOfJobApplications;

    private String resumeLink;

    private String skills;

    private String resumeContent;

    public JobSeeker(Long id, String name, int age, String email, String gender, LocalDate createdTime, LocalDate dateOfBirth, String location, String username, String skills, String resumeContent) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.createdTime = createdTime;
        this.dateOfBirth = dateOfBirth;
        this.location = location;
        this.username = username;
        this.isBlocked = false;
        this.educationDetailsPresent = false;
        this.numberOfJobApplications = 0;
        this.skills = skills;
        this.resumeContent = resumeContent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDate createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public boolean isEducationDetailsPresent() {
        return educationDetailsPresent;
    }

    public void setEducationDetailsPresent(boolean educationDetailsPresent) {
        this.educationDetailsPresent = educationDetailsPresent;
    }

    public int getNumberOfJobApplications() {
        return numberOfJobApplications;
    }

    public void setNumberOfJobApplications(int numberOfJobApplications) {
        this.numberOfJobApplications = numberOfJobApplications;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getResumeContent() {
        return resumeContent;
    }

    public void setResumeContent(String resumeContent) {
        this.resumeContent = resumeContent;
    }
}
