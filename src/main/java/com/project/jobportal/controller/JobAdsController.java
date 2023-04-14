package com.project.jobportal.controller;

import com.project.jobportal.entity.JobAds;
import com.project.jobportal.repository.JobAdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobads")
public class JobAdsController {

    @Autowired
    JobAdsRepository jobAdsRepository;

    @GetMapping("/get/{id}")
    public JobAds getAdd(@PathVariable Long id){
        return jobAdsRepository.findById(id).get();
    }


    @GetMapping("/get/all")
    public List<JobAds> getAllJobAds(){
        return jobAdsRepository.findAll();
    }
}
