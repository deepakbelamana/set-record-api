package com.dpkProjects.SetRecordApp.Services.Impl;

import com.dpkProjects.SetRecordApp.Repositories.WorkOutCategoryRepo;
import com.dpkProjects.SetRecordApp.Services.WorkOutCategoryService;
import com.dpkProjects.SetRecordApp.models.WorkOutCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkOutCategoryServiceImpl implements WorkOutCategoryService {

    @Autowired
    private WorkOutCategoryRepo workOutCategoryRepo;
    @Override
    public WorkOutCategory addWorkOutCategory(WorkOutCategory workOutCategory) {
        return workOutCategoryRepo.save(workOutCategory);
    }

    @Override
    public List<WorkOutCategory> getAllWorkOutCategories() {
        return workOutCategoryRepo.findAll();
    }

    @Override
    public WorkOutCategory updateWorkOutCategory(WorkOutCategory workOutCategory) {
        WorkOutCategory origWorkOutCategory;
        origWorkOutCategory = workOutCategoryRepo.findById(workOutCategory.getCategoryId()).orElse(new WorkOutCategory());
        origWorkOutCategory.setCategoryName(workOutCategory.getCategoryName());
        origWorkOutCategory.setDescription(workOutCategory.getDescription());
        origWorkOutCategory.setWorkOutsList(workOutCategory.getWorkOutsList());
        return workOutCategoryRepo.save(origWorkOutCategory);
    }


}
