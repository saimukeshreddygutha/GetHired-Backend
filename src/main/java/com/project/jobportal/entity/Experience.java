package com.project.jobportal.entity;

import java.time.LocalDate;

public class Experience {

    private String companyName;
    private String designation;
    private LocalDate startDate;
    private LocalDate endDate;
    private String descriptionOfRole;

    private boolean isCurrentlyWorking;

    public Experience() {
    }

    public Experience(String companyName, String designation, LocalDate startDate, LocalDate endDate, String descriptionOfRole, boolean isCurrentlyWorking) {
        this.companyName = companyName;
        this.designation = designation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.descriptionOfRole = descriptionOfRole;
        this.isCurrentlyWorking = isCurrentlyWorking;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public String getDescriptionOfRole() {
        return descriptionOfRole;
    }

    public void setDescriptionOfRole(String descriptionOfRole) {
        this.descriptionOfRole = descriptionOfRole;
    }

    public boolean isCurrentlyWorking() {
        return isCurrentlyWorking;
    }

    public void setCurrentlyWorking(boolean currentlyWorking) {
        isCurrentlyWorking = currentlyWorking;
    }
}
