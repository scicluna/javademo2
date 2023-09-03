package com.jobsearch.joblisting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobsController {
    @Autowired
    private JobsService jobsService;
    @GetMapping("/")
    public ResponseEntity<List<Jobpost>> getAllJobs(){
        return new ResponseEntity<List<Jobpost>>(jobsService.getJobs(), HttpStatus.OK);
    }
}
