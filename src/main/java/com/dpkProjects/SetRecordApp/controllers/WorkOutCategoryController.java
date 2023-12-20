package com.dpkProjects.SetRecordApp.controllers;

import com.dpkProjects.SetRecordApp.Services.WorkOutCategoryService;
import com.dpkProjects.SetRecordApp.models.WorkOutCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/category")
public class WorkOutCategoryController {

    @Autowired
    private WorkOutCategoryService workOutCategoryService;
        @PostMapping()
        public ResponseEntity<WorkOutCategory> saveWorkOutCategory(@RequestBody WorkOutCategory workOutCategory) {
            return ResponseEntity.ok(workOutCategoryService.addWorkOutCategory(workOutCategory));
        }
        @GetMapping()
        public ResponseEntity<List<WorkOutCategory>> getAllWorkOutCategories() {
            return ResponseEntity.status(HttpStatus.OK).body(workOutCategoryService.getAllWorkOutCategories());
        }

        @PostMapping("/update")
        public ResponseEntity<WorkOutCategory> updateWorkOutCategory(@RequestBody WorkOutCategory workOutCategory) {
            return ResponseEntity.status(HttpStatus.OK).body(workOutCategoryService.updateWorkOutCategory(workOutCategory));
        }
}
