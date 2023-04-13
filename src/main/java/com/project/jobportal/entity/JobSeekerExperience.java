package com.project.jobportal.entity;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "jobseeker_experience")
public class JobSeekerExperience {

    private Long id;

    private String username;
    List<Experience> experienceList;

    public JobSeekerExperience() {
    }

    public JobSeekerExperience(Long id, String username, List<Experience> experienceList) {
        this.id = id;
        this.username = username;
        this.experienceList = experienceList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }
}
