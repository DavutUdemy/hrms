package com.example.demo.business.concretes;

import com.example.demo.business.abstracts.JobsService;
import com.example.demo.dataAccess.abstracts.JobsDao;
import com.example.demo.entities.concretes.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsManager implements JobsService {
    private JobsDao jobsDao;

@Autowired
    public JobsManager(JobsDao jobsDao) {
        this.jobsDao = jobsDao;
    }
    @Override
    public List<Jobs> getAll() {
        // TODO Auto-generated method stub
        return this.jobsDao.findAll();


    }

    @Override
    public void addNewJobs(Jobs jobs) {
        jobsDao.save(jobs);
    }

}
