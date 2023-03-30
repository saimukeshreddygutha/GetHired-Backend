package com.project.jobportal.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    @GetMapping("/")
    public ResponseEntity<String >allApplicants(){
        return new ResponseEntity<>("All Applicants", HttpStatus.OK);
    }
}
