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

    public JobSeeker(Long id, String name, int age, String email, String gender, LocalDate createdTime, LocalDate dateOfBirth, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.createdTime = createdTime;
        this.dateOfBirth = dateOfBirth;
        this.location = location;
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
}
