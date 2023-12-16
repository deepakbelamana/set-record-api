package com.dpkProjects.SetRecordApp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("WORKOUT_CATEGORY")
public class WorkOutCategory {

    @MongoId
    private String  categoryId;

    private String categoryName;

    private List<WorkOut> workOutsList;

    private String description;

}
