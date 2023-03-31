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

    private Long jobSeekerId;

    private Long recruiterId;

    private String jobSeekerName;
    private List<Education> educationList;

    private List<Experience> experienceList;

    private String location;
    private String gender;
}
