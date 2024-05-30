package com.kackan1.trainingapp.training;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TrainingDto {
    private long id;
    private String name;
    private String notes;
    private List<ExerciseDto> exercises;
}
