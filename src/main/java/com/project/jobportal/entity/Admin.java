package com.project.jobportal.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document(collection = "admin")
public class Admin {

    @Transient
    public static final String SEQUENCE_NAME = "admin";

    @Id
    private Long id;

    private String username;
    private String password;

    private String email;

    private LocalDate createdDate;

    public Admin() {
    }

    public Admin(Long id, String username, String password, String email, LocalDate createdDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdDate = createdDate;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
