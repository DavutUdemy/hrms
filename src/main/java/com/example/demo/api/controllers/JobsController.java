package com.example.demo.api.controllers;

import com.example.demo.business.abstracts.JobsService;
import com.example.demo.entities.concretes.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
private JobsService jobsService;
@Autowired
    public JobsController(JobsService jobsService) {
        this.jobsService = jobsService;
    }
    @GetMapping("/getall")
    public List<Jobs> getAll(){
        return this.jobsService.getAll();
    }
@PostMapping("/addNewJob")
    public void addNewJob(@RequestBody Jobs jobs){
    this.jobsService.addNewJobs(jobs);
}
}
