package com.example.demo.business.abstracts;

import com.example.demo.entities.concretes.Jobs;

import java.util.List;

public interface JobsService {
    List<Jobs> getAll();
    void addNewJobs(Jobs jobs);


}
