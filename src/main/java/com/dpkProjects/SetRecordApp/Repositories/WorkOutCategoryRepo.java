package com.dpkProjects.SetRecordApp.Repositories;

import com.dpkProjects.SetRecordApp.models.WorkOutCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkOutCategoryRepo extends MongoRepository<WorkOutCategory,String> {



}
