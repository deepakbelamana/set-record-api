package com.dpkProjects.SetRecordApp.Services;

import com.dpkProjects.SetRecordApp.models.WorkOutCategory;

import java.util.List;
import java.util.Optional;

public interface WorkOutCategoryService {

    WorkOutCategory addWorkOutCategory(WorkOutCategory workOutCategory);

    List<WorkOutCategory> getAllWorkOutCategories();

    WorkOutCategory updateWorkOutCategory(WorkOutCategory workOutCategory);
}
