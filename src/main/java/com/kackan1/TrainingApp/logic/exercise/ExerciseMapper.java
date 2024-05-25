package com.kackan1.trainingapp.logic.exercise;

import java.util.ArrayList;
import java.util.List;

import com.kackan1.trainingapp.model.Exercise;
import com.kackan1.trainingapp.model.Training;

public class ExerciseMapper {

    public Exercise toEntity(ExerciseDto dto, Training training) {
        return Exercise.builder()
                .id(dto.getId())
                .name(dto.getName())
                .training(training)
                .exerciseSets(dto.getExerciseSets())
                .build();
    }

    public ExerciseDto toDto(Exercise entity) {
        return ExerciseDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .trainingId(entity.getTraining().getId())
                .exerciseSets(entity.getExerciseSets())
                .build();
    }

    public List<Exercise> toEntity(List<ExerciseDto> dto, Training training) {
        if (dto == null) {
            return new ArrayList<>();
        }
        return dto.stream().map(e -> toEntity(e, training)).toList();
    }

    public List<ExerciseDto> toDto(List<Exercise> entity) {
        return entity.stream().map(this::toDto).toList();
    }
}
