package com.jobsearch.joblisting;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsDb extends MongoRepository<Jobpost, ObjectId> {
}
