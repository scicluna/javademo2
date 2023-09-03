package com.jobsearch.joblisting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsService {
    @Autowired
    private JobsDb jobsDb;

    public List<Jobpost> getJobs(){
        return jobsDb.findAll();
    }
}
