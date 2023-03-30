package com.project.jobportal.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "applicants")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Applicant {
    @Id
    private ObjectId id;
    private String name;
    private int age;
    private String branch;
    private String email;
    private Long phoneNumber;
    private int sem;
    private boolean isGraduated;
    private String institution;
    private String university;
    private List<String> skills;
    private String gender;


}
