package com.project.jobportal.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer {
    private ObjectId id;
    private String org;
    private int jobsPosted;
    private int hiredCount;
    private String description;

}
