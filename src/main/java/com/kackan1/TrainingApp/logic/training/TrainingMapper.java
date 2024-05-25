package com.kackan1.trainingapp.logic.training;

import java.util.List;

import com.kackan1.trainingapp.logic.Mapper;
import com.kackan1.trainingapp.logic.exercise.ExerciseMapper;
import com.kackan1.trainingapp.model.Training;

public class TrainingMapper implements Mapper<Training, TrainingDto> {

  @Override
  public Training toEntity(TrainingDto dto) {
    return Training.builder()
        .name(dto.getName())
        .build();
  }

  @Override
  public TrainingDto toDto(Training entity) {
    return TrainingDto.builder()
        .id(entity.getId())
        .name(entity.getName())
        .exercises(new ExerciseMapper().toDto(entity.getExercises()))
        .build();
  }

  public List<Training> toEntity(List<TrainingDto> dto) {
    return dto.stream().map(this::toEntity).toList();
  }

  public List<TrainingDto> toDto(List<Training> entity) {
    return entity.stream().map(this::toDto).toList();
  }
}
