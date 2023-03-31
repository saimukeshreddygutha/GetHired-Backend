package com.project.jobportal.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "jobseeker_education")
public class JobSeekerEducation {

    @Id
    private Long id;

    private List<Education> educationDetails;

    public JobSeekerEducation(Long id, List<Education> educationDetails) {
        this.id = id;
        this.educationDetails = educationDetails;
    }
}
