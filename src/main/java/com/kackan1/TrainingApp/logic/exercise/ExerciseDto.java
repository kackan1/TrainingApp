package com.kackan1.trainingapp.logic.exercise;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExerciseDto {
    private long id;
    private String name;
    private long trainingId;
    private List<String> exerciseSets;
}
