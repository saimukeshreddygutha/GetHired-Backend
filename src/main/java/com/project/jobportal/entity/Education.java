package com.project.jobportal.entity;

import java.time.LocalDate;

public class Education {

    private String instituteName;
    private String program;

    private String branch;

    private float cgpa;

    private LocalDate startDate;
    private LocalDate endDate;


    public Education(String instituteName, String program, String branch, float cgpa,
                     LocalDate startDate, LocalDate endDate) {
        this.instituteName = instituteName;
        this.program = program;
        this.branch = branch;
        this.cgpa = cgpa;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Education() {
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


}
