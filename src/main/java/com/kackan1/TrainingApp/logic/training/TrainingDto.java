package com.kackan1.trainingapp.logic.training;

import java.util.List;

import com.kackan1.trainingapp.logic.exercise.ExerciseDto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TrainingDto {
  private long id;
  private String name;
  private List<ExerciseDto> exercises;
}
