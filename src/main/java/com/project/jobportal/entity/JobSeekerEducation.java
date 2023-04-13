package com.project.jobportal.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "jobseeker_education")
public class JobSeekerEducation {

    @Id
    private Long id;

    private String username;
    private List<Education> educationDetails;

    public JobSeekerEducation(Long id, String username, List<Education> educationDetails) {
        this.id = id;
        this.username = username;
        this.educationDetails = educationDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Education> getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(List<Education> educationDetails) {
        this.educationDetails = educationDetails;
    }
}
