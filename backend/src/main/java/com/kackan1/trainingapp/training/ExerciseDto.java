package com.kackan1.trainingapp.training;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ExerciseDto {
    private long id;
    private String name;
    private String notes;
    private long training_id;
}
