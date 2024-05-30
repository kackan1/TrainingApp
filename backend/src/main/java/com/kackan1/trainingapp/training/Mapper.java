package com.kackan1.trainingapp.training;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    private Mapper() {
    }

    protected static Training toEntity(TrainingDto dto) {
        Training training = new Training();
        training.setName(dto.getName());
        training.setNotes(dto.getNotes());
        if (dto.getExercises() == null) {
            training.setExercises(new ArrayList<Exercise>());
        } else {
            training.setExercises(
                    dto.getExercises().stream()
                            .map(e -> Mapper.toExercise(e, training))
                            .toList());
        }
        return training;
    }

    protected static TrainingDto toDto(Training entity) {
        return TrainingDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .notes(entity.getNotes())
                .exercises(
                        entity.getExercises().stream()
                                .map(Mapper::toExerciseDto)
                                .toList())
                .build();
    }

    protected static List<Training> toEntity(List<TrainingDto> dtos) {
        return dtos.stream().map(Mapper::toEntity).toList();
    }

    protected static List<TrainingDto> toDto(List<Training> entitys) {
        return entitys.stream().map(Mapper::toDto).toList();
    }

    protected static Exercise toExercise(ExerciseDto exerciseDto, Training training) {
        Exercise exercise = new Exercise();
        exercise.setName(exerciseDto.getName());
        exercise.setNotes(exerciseDto.getNotes());
        exercise.setTraining(training);
        return exercise;
    }

    protected static ExerciseDto toExerciseDto(Exercise exercise) {
        return ExerciseDto.builder()
                .id(exercise.getId())
                .name(exercise.getName())
                .notes(exercise.getNotes())
                .training_id(exercise.getTraining().getId())
                .build();
    }
}
