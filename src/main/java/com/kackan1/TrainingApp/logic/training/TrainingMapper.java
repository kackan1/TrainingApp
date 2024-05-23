package com.kackan1.trainingapp.logic.training;

import com.kackan1.trainingapp.logic.Mapper;
import com.kackan1.trainingapp.model.training.Training;

public class TrainingMapper implements Mapper<Training, TrainingDto> {

  @Override
  public Training toEntity(TrainingDto dto) {
    return Training.builder()
        .id(dto.getId())
        .name(dto.getName())
        .build();
  }

  @Override
  public TrainingDto toDto(Training entity) {
    return TrainingDto.builder()
        .id(entity.getId())
        .name(entity.getName())
        .build();
  }
}
